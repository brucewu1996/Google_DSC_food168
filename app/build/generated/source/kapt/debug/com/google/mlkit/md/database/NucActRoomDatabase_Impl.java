package com.google.mlkit.md.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NucActRoomDatabase_Impl extends NucActRoomDatabase {
  private volatile barcodeDao _barcodeDao;

  private volatile foodDao _foodDao;

  private volatile diaryDao _diaryDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `barcode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `barcode_value` TEXT NOT NULL, `item` TEXT NOT NULL, `energy` REAL NOT NULL, `protein` REAL NOT NULL, `total_lipid` REAL NOT NULL, `carbohydrate` REAL NOT NULL, `fiber` REAL NOT NULL, `sugar` REAL NOT NULL, `Na` REAL NOT NULL, `saturated_fatty_acids` REAL NOT NULL, `trans_fatty_acids` REAL NOT NULL, `cholesterol` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `food` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `item` TEXT NOT NULL, `energy` REAL NOT NULL, `protein` REAL NOT NULL, `total_lipid` REAL NOT NULL, `carbohydrate` REAL NOT NULL, `fiber` REAL NOT NULL, `sugar` REAL NOT NULL, `Na` REAL NOT NULL, `saturated_fatty_acids` REAL NOT NULL, `trans_fatty_acids` REAL NOT NULL, `cholesterol` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `diary_record` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date` INTEGER NOT NULL, `item` TEXT NOT NULL, `energy` REAL NOT NULL, `protein` REAL NOT NULL, `total_lipid` REAL NOT NULL, `carbohydrate` REAL NOT NULL, `fiber` REAL NOT NULL, `sugar` REAL NOT NULL, `Na` REAL NOT NULL, `saturated_fatty_acids` REAL NOT NULL, `trans_fatty_acids` REAL NOT NULL, `cholesterol` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ee5dfeacce40d56b4b974270dc671a15')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `barcode`");
        _db.execSQL("DROP TABLE IF EXISTS `food`");
        _db.execSQL("DROP TABLE IF EXISTS `diary_record`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBarcode = new HashMap<String, TableInfo.Column>(13);
        _columnsBarcode.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("barcode_value", new TableInfo.Column("barcode_value", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("item", new TableInfo.Column("item", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("energy", new TableInfo.Column("energy", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("protein", new TableInfo.Column("protein", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("total_lipid", new TableInfo.Column("total_lipid", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("carbohydrate", new TableInfo.Column("carbohydrate", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("fiber", new TableInfo.Column("fiber", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("sugar", new TableInfo.Column("sugar", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("Na", new TableInfo.Column("Na", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("saturated_fatty_acids", new TableInfo.Column("saturated_fatty_acids", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("trans_fatty_acids", new TableInfo.Column("trans_fatty_acids", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBarcode.put("cholesterol", new TableInfo.Column("cholesterol", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBarcode = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBarcode = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBarcode = new TableInfo("barcode", _columnsBarcode, _foreignKeysBarcode, _indicesBarcode);
        final TableInfo _existingBarcode = TableInfo.read(_db, "barcode");
        if (! _infoBarcode.equals(_existingBarcode)) {
          return new RoomOpenHelper.ValidationResult(false, "barcode(com.google.mlkit.md.database.barcode).\n"
                  + " Expected:\n" + _infoBarcode + "\n"
                  + " Found:\n" + _existingBarcode);
        }
        final HashMap<String, TableInfo.Column> _columnsFood = new HashMap<String, TableInfo.Column>(12);
        _columnsFood.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("item", new TableInfo.Column("item", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("energy", new TableInfo.Column("energy", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("protein", new TableInfo.Column("protein", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("total_lipid", new TableInfo.Column("total_lipid", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("carbohydrate", new TableInfo.Column("carbohydrate", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("fiber", new TableInfo.Column("fiber", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("sugar", new TableInfo.Column("sugar", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("Na", new TableInfo.Column("Na", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("saturated_fatty_acids", new TableInfo.Column("saturated_fatty_acids", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("trans_fatty_acids", new TableInfo.Column("trans_fatty_acids", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFood.put("cholesterol", new TableInfo.Column("cholesterol", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFood = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFood = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFood = new TableInfo("food", _columnsFood, _foreignKeysFood, _indicesFood);
        final TableInfo _existingFood = TableInfo.read(_db, "food");
        if (! _infoFood.equals(_existingFood)) {
          return new RoomOpenHelper.ValidationResult(false, "food(com.google.mlkit.md.database.food).\n"
                  + " Expected:\n" + _infoFood + "\n"
                  + " Found:\n" + _existingFood);
        }
        final HashMap<String, TableInfo.Column> _columnsDiaryRecord = new HashMap<String, TableInfo.Column>(13);
        _columnsDiaryRecord.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("item", new TableInfo.Column("item", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("energy", new TableInfo.Column("energy", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("protein", new TableInfo.Column("protein", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("total_lipid", new TableInfo.Column("total_lipid", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("carbohydrate", new TableInfo.Column("carbohydrate", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("fiber", new TableInfo.Column("fiber", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("sugar", new TableInfo.Column("sugar", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("Na", new TableInfo.Column("Na", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("saturated_fatty_acids", new TableInfo.Column("saturated_fatty_acids", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("trans_fatty_acids", new TableInfo.Column("trans_fatty_acids", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDiaryRecord.put("cholesterol", new TableInfo.Column("cholesterol", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDiaryRecord = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDiaryRecord = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDiaryRecord = new TableInfo("diary_record", _columnsDiaryRecord, _foreignKeysDiaryRecord, _indicesDiaryRecord);
        final TableInfo _existingDiaryRecord = TableInfo.read(_db, "diary_record");
        if (! _infoDiaryRecord.equals(_existingDiaryRecord)) {
          return new RoomOpenHelper.ValidationResult(false, "diary_record(com.google.mlkit.md.database.diary_record).\n"
                  + " Expected:\n" + _infoDiaryRecord + "\n"
                  + " Found:\n" + _existingDiaryRecord);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ee5dfeacce40d56b4b974270dc671a15", "073aa900b943dcde8f72bac58c4321b9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "barcode","food","diary_record");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `barcode`");
      _db.execSQL("DELETE FROM `food`");
      _db.execSQL("DELETE FROM `diary_record`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public barcodeDao barcodeDao() {
    if (_barcodeDao != null) {
      return _barcodeDao;
    } else {
      synchronized(this) {
        if(_barcodeDao == null) {
          _barcodeDao = new barcodeDao_Impl(this);
        }
        return _barcodeDao;
      }
    }
  }

  @Override
  public foodDao foodDao() {
    if (_foodDao != null) {
      return _foodDao;
    } else {
      synchronized(this) {
        if(_foodDao == null) {
          _foodDao = new foodDao_Impl(this);
        }
        return _foodDao;
      }
    }
  }

  @Override
  public diaryDao diaryDao() {
    if (_diaryDao != null) {
      return _diaryDao;
    } else {
      synchronized(this) {
        if(_diaryDao == null) {
          _diaryDao = new diaryDao_Impl(this);
        }
        return _diaryDao;
      }
    }
  }
}
