package com.google.mlkit.md.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class barcodeDao_Impl implements barcodeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<barcode> __insertionAdapterOfbarcode;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public barcodeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfbarcode = new EntityInsertionAdapter<barcode>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `barcode` (`id`,`barcode_value`,`item`,`energy`,`protein`,`total_lipid`,`carbohydrate`,`fiber`,`sugar`,`Na`,`saturated_fatty_acids`,`trans_fatty_acids`,`cholesterol`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, barcode value) {
        stmt.bindLong(1, value.getId());
        if (value.getBarcode_value() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBarcode_value());
        }
        if (value.getItem() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getItem());
        }
        stmt.bindDouble(4, value.getEnergy());
        stmt.bindDouble(5, value.getProtein());
        stmt.bindDouble(6, value.getTotal_lipid());
        stmt.bindDouble(7, value.getCarbohydrate());
        stmt.bindDouble(8, value.getFiber());
        stmt.bindDouble(9, value.getSugar());
        stmt.bindDouble(10, value.getNa());
        stmt.bindDouble(11, value.getSaturated_fatty_acids());
        stmt.bindDouble(12, value.getTrans_fatty_acids());
        stmt.bindDouble(13, value.getCholesterol());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM barcode";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<barcode> barcode) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfbarcode.insert(barcode);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object insert(final barcode barcode, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfbarcode.insert(barcode);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public barcode finditembybarcode(final String barcode_result) {
    final String _sql = "SELECT * FROM barcode WHERE barcode_value LIKE ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (barcode_result == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, barcode_result);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfBarcodeValue = CursorUtil.getColumnIndexOrThrow(_cursor, "barcode_value");
      final int _cursorIndexOfItem = CursorUtil.getColumnIndexOrThrow(_cursor, "item");
      final int _cursorIndexOfEnergy = CursorUtil.getColumnIndexOrThrow(_cursor, "energy");
      final int _cursorIndexOfProtein = CursorUtil.getColumnIndexOrThrow(_cursor, "protein");
      final int _cursorIndexOfTotalLipid = CursorUtil.getColumnIndexOrThrow(_cursor, "total_lipid");
      final int _cursorIndexOfCarbohydrate = CursorUtil.getColumnIndexOrThrow(_cursor, "carbohydrate");
      final int _cursorIndexOfFiber = CursorUtil.getColumnIndexOrThrow(_cursor, "fiber");
      final int _cursorIndexOfSugar = CursorUtil.getColumnIndexOrThrow(_cursor, "sugar");
      final int _cursorIndexOfNa = CursorUtil.getColumnIndexOrThrow(_cursor, "Na");
      final int _cursorIndexOfSaturatedFattyAcids = CursorUtil.getColumnIndexOrThrow(_cursor, "saturated_fatty_acids");
      final int _cursorIndexOfTransFattyAcids = CursorUtil.getColumnIndexOrThrow(_cursor, "trans_fatty_acids");
      final int _cursorIndexOfCholesterol = CursorUtil.getColumnIndexOrThrow(_cursor, "cholesterol");
      final barcode _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpBarcode_value;
        _tmpBarcode_value = _cursor.getString(_cursorIndexOfBarcodeValue);
        final String _tmpItem;
        _tmpItem = _cursor.getString(_cursorIndexOfItem);
        final double _tmpEnergy;
        _tmpEnergy = _cursor.getDouble(_cursorIndexOfEnergy);
        final double _tmpProtein;
        _tmpProtein = _cursor.getDouble(_cursorIndexOfProtein);
        final double _tmpTotal_lipid;
        _tmpTotal_lipid = _cursor.getDouble(_cursorIndexOfTotalLipid);
        final double _tmpCarbohydrate;
        _tmpCarbohydrate = _cursor.getDouble(_cursorIndexOfCarbohydrate);
        final double _tmpFiber;
        _tmpFiber = _cursor.getDouble(_cursorIndexOfFiber);
        final double _tmpSugar;
        _tmpSugar = _cursor.getDouble(_cursorIndexOfSugar);
        final double _tmpNa;
        _tmpNa = _cursor.getDouble(_cursorIndexOfNa);
        final double _tmpSaturated_fatty_acids;
        _tmpSaturated_fatty_acids = _cursor.getDouble(_cursorIndexOfSaturatedFattyAcids);
        final double _tmpTrans_fatty_acids;
        _tmpTrans_fatty_acids = _cursor.getDouble(_cursorIndexOfTransFattyAcids);
        final double _tmpCholesterol;
        _tmpCholesterol = _cursor.getDouble(_cursorIndexOfCholesterol);
        _result = new barcode(_tmpId,_tmpBarcode_value,_tmpItem,_tmpEnergy,_tmpProtein,_tmpTotal_lipid,_tmpCarbohydrate,_tmpFiber,_tmpSugar,_tmpNa,_tmpSaturated_fatty_acids,_tmpTrans_fatty_acids,_tmpCholesterol);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
