package com.example.nucaction.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface BarcodeDao {
    //select one item
    @Query("SELECT * FROM barcode_model WHERE barcode_value LIKE :barcode_value LIMIT 1")
    fun getBarcodeFood(barcode_value: String): BarcodeModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(barcode: List<BarcodeModel?>?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(barcode: BarcodeModel)

    @Query("DELETE FROM barcode_model")
    suspend fun deleteAll()
}