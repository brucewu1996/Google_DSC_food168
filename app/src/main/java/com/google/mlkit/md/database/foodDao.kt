package com.google.mlkit.md.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface foodDao {

    @Query("SELECT * FROM food WHERE item = :food_input LIMIT 1")
    fun finditembyfood(food_input :String): food

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(food: List<food?>?)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(food: food)

    @Query("DELETE FROM food")
    suspend fun deleteAll()
}