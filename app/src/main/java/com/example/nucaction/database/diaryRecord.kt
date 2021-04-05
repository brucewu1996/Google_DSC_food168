package com.example.nucaction.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "diaryRecord",
    foreignKeys = [
        ForeignKey(
            entity = foodScan::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("FoodScanId"),
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = barcode::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("BarcodeId"),
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class diaryRecord(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "date")
    var date: Calendar,

    @ColumnInfo(name = "FoodScanId")
    var ScanFoodId: Int,

    @ColumnInfo(name = "BarcodeId")
    var BarcodeFoodId: Int,
)