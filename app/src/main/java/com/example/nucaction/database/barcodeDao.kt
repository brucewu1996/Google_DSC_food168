package com.example.nucaction.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface barcodeDao {

    //select one item
    @Query("SELECT * FROM barcode WHERE barcode_value LIKE :barcode_value LIMIT 1")
    fun getBarcodeFood(barcode_value: String): barcode

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(barcode: List<barcode?>?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(barcode: barcode)

    @Query("DELETE FROM barcode")
    suspend fun deleteAll()
}