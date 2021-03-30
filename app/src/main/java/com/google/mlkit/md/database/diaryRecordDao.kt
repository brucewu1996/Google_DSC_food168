package com.google.mlkit.md.database

import android.content.Context
import androidx.room.*
import java.util.*

@Dao
interface diaryDao {

    @Query("SELECT * FROM diary_record WHERE date = :date_input ")
    fun finddiaryrecode(date_input :Date): diary_record

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(diary_record: diary_record)

    @Query("DELETE FROM diary_record")
    suspend fun deleteAll()
}