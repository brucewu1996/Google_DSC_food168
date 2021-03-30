package com.google.mlkit.md.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.google.mlkit.md.database.Converters.class})
@androidx.room.Database(entities = {com.google.mlkit.md.database.barcode.class, com.google.mlkit.md.database.food.class, com.google.mlkit.md.database.diary_record.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/google/mlkit/md/database/NucActRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "barcodeDao", "Lcom/google/mlkit/md/database/barcodeDao;", "diaryDao", "Lcom/google/mlkit/md/database/diaryDao;", "foodDao", "Lcom/google/mlkit/md/database/foodDao;", "Companion", "app_debug"})
public abstract class NucActRoomDatabase extends androidx.room.RoomDatabase {
    private static volatile com.google.mlkit.md.database.NucActRoomDatabase instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.database.NucActRoomDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.mlkit.md.database.barcodeDao barcodeDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.mlkit.md.database.foodDao foodDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.mlkit.md.database.diaryDao diaryDao();
    
    public NucActRoomDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/mlkit/md/database/NucActRoomDatabase$Companion;", "", "()V", "instance", "Lcom/google/mlkit/md/database/NucActRoomDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "app_debug"})
    public static final class Companion {
        
        private final com.google.mlkit.md.database.NucActRoomDatabase buildDatabase(android.content.Context context, kotlinx.coroutines.CoroutineScope scope) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}