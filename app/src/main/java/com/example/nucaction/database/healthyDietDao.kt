package com.example.nucaction.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface HealthyDietDao{
    @Query("SELECT * FROM healthyDiet_model")
    fun getAllHealthyDiet():List<HealthyDietModel>
}