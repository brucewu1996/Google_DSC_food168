package com.google.mlkit.md.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface barcodeDao {

    @Query("SELECT * FROM barcode WHERE barcode_value LIKE :barcode_result LIMIT 1")
    fun finditembybarcode(barcode_result :String) : barcode

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(barcode: List<barcode?>?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(barcode: barcode)

    @Query("DELETE FROM barcode")
    suspend fun deleteAll()
}