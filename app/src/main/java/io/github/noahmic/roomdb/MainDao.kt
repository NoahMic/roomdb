package io.github.noahmic.roomdb

import androidx.room.*

@Dao
interface MainDao {
    @Query("SELECT * FROM itementity")
    fun getAll() : List<ItemEntity>

    @Insert
    fun insertAll(vararg itemEntity: ItemEntity)

    @Delete
    fun delete(itemEntity: ItemEntity)

    @Update
    fun update(itemEntity: ItemEntity)
}