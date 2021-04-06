package com.example.nucaction.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import java.util.*

@Dao
interface DiaryRecordDao{

    @Query("SELECT * FROM diaryRecord_model WHERE date =:date")
    // TODO 1. Cannot figure out how to save this field into database. You can consider adding a type converter for it.
    //    private java.util.Date date;
    fun getDiaryRecords(date: String): List<DiaryRecordModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(diary_record: DiaryRecordModel)

    @Query("DELETE FROM diaryRecord_model")
    suspend fun deleteAll()

}