package com.example.nucaction.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface healthyDietDao{
    @Query("SELECT * FROM healthyDiet")
    fun getAllHealthyDiet()

}