package com.example.nucaction.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        barcode::class,
        diaryRecord::class,
        foodScan::class,
        healthyDiet::class], version = 1
)
abstract class NucActionDatabase : RoomDatabase() {
    abstract fun getBarcodeDao(): barcodeDao
    abstract fun getDiaryRecord(): diaryRecordDao
    abstract fun getFoodScan(): foodScanDao
    abstract fun getHealthyDiet(): healthyDietDao

    companion object {
        @Volatile
        private var INSTANCE: NucActionDatabase? = null

        //        fun getDatabase(context: Context, scope: CoroutineScope): NucActionDatabase {
//            return INSTANCE ?: synchronized(this) {
//                val instance =
//                    Room.databaseBuilder(
//                        context.applicationContext,
//                        NucActionDatabase::class.java,
//                        "nucaction_database"
//                    ).fallbackToDestructiveMigration()
//                        .allowMainThreadQueries()
//                        .addCallback(ItemDatabaseCallback(scope))
//                        .build()
//                INSTANCE = instance
//                // return instance
//                instance
//            }
//        }
        fun getInstance(context: Context): NucActionDatabase? {
            if (INSTANCE == null) {
                synchronized(NucActionDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context,
                        NucActionDatabase::class.java,
                        NucActionDatabase::class.java.simpleName
                    ).build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }

    }
}