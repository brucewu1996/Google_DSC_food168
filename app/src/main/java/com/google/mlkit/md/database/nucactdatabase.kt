package com.google.mlkit.md.database

import android.app.PendingIntent.getActivity
import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.room.*
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.IOException
import java.io.InputStream
import java.time.chrono.HijrahChronology.INSTANCE
import java.util.*


class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time?.toLong()
    }
}



@Database(entities = arrayOf(barcode::class,food::class,diary_record::class), version = 1, exportSchema = false)
@TypeConverters(Converters::class)
public abstract class NucActRoomDatabase : RoomDatabase() {

    abstract fun barcodeDao(): barcodeDao
    abstract fun foodDao(): foodDao
    abstract fun diaryDao(): diaryDao


    companion object {
        // Singleton prevents multiple instances of NucAction.database opening at the
        // same time

        @Volatile private var instance: NucActRoomDatabase? = null

        // Create and pre-populate the NucAction.database. See this article for more details:
        // https://medium.com/google-developers/7-pro-tips-for-room-fbadea4bfbd1#4785
        private fun buildDatabase(context: Context ,
                                  scope: CoroutineScope): NucActRoomDatabase {
            return Room.databaseBuilder(context, NucActRoomDatabase::class.java, "NucAct_database")
                    .addCallback(
                            object : RoomDatabase.Callback() {
                                @RequiresApi(Build.VERSION_CODES.O)
                                override fun onCreate(db: SupportSQLiteDatabase) {
                                    super.onCreate(db)
                                    INSTANCE?.let { database ->
                                        scope.launch(Dispatchers.IO) {

                                        }
                                    }
                                }
                            }
                    ).build()
        }
    }
}


