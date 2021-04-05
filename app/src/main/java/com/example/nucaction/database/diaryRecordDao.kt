package com.example.nucaction.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import java.util.*

@Dao
interface diaryRecordDao{

    @Query("SELECT * FROM diaryRecord WHERE date LIKE :date_input")
    fun getDiaryRecords(date_input: Date)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(diary_record: diaryRecord)

    @Query("DELETE FROM diaryRecord")
    suspend fun deleteAll()

}