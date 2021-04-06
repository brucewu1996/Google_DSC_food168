package com.example.nucaction.database

import androidx.room.*
import com.google.android.gms.common.config.GservicesValue.value
import java.util.*


@Entity(
    tableName = "diaryRecord_model",
    indices = arrayOf(Index(value = ["FoodScanId"], unique = true), Index(value = ["BarcodeId"], unique = true)),
    foreignKeys = [
        ForeignKey(
            entity = FoodScanModel::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("FoodScanId"),
            onDelete = ForeignKey.CASCADE
        ),

        ForeignKey(
            entity = BarcodeModel::class,
            parentColumns = arrayOf("id"),
            childColumns = arrayOf("BarcodeId"),
            onDelete = ForeignKey.CASCADE
        )
    ]
)
class DiaryRecordModel(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "date")
    var date: String,

    @ColumnInfo(name = "FoodScanId")
    var FoodScanId: Int,

    @ColumnInfo(name = "BarcodeId")
    var BarcodeId: Int,
)