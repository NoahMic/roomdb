package io.github.noahmic.roomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class ItemEntity (
    @ColumnInfo(name = "content") val content: Int
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}