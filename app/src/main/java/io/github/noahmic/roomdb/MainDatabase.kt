package io.github.noahmic.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ItemEntity::class], version = 1)
abstract class MainDatabase :RoomDatabase() {
    abstract fun mainDao()
    companion object {
        private var instance : MainDatabase? = null

        @Synchronized
        fun getInstance(context: Context) : MainDatabase? {
            if (instance == null) {
                synchronized(MainDatabase::class) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        MainDatabase::class.java,
                        "main-database"
                    ).fallbackToDestructiveMigration().allowMainThreadQueries().build()
                }
            }
        }
    }
}