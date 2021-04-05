package com.example.nucaction.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "healthyDiet")
data class healthyDiet(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "gender")
    var gender: String,

    @ColumnInfo(name="age")
    var age: Int,

    @ColumnInfo(name="weight")
    var weight: Int,

    @ColumnInfo(name="height")
    var height: Int,

    @ColumnInfo(name = "energy")
    var energy: Double,

    @ColumnInfo(name = "protein")
    var protein: Double,

    @ColumnInfo(name = "total_lipid")
    var total_lipid: Double,

    @ColumnInfo(name = "carbohydrate")
    var carbohydrate: Double,

    @ColumnInfo(name = "fiber")
    var fiber: Double,

    @ColumnInfo(name = "sugar")
    var sugar: Double,

    @ColumnInfo(name="Na")
    var Na: Double,

    @ColumnInfo(name = "saturated_fatty_acids")
    var saturated_fatty_acids: Double,

    @ColumnInfo(name = "trans_fatty_acids")
    var trans_fatty_acids: Double,

    @ColumnInfo(name = "cholesterol")
    var cholesterol: Double,
)