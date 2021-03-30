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
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Date;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class diaryDao_Impl implements diaryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<diary_record> __insertionAdapterOfdiary_record;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public diaryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfdiary_record = new EntityInsertionAdapter<diary_record>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `diary_record` (`id`,`date`,`item`,`energy`,`protein`,`total_lipid`,`carbohydrate`,`fiber`,`sugar`,`Na`,`saturated_fatty_acids`,`trans_fatty_acids`,`cholesterol`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, diary_record value) {
        stmt.bindLong(1, value.getId());
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
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
        final String _query = "DELETE FROM diary_record";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final diary_record diary_record, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfdiary_record.insert(diary_record);
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
  public diary_record finddiaryrecode(final Date date_input) {
    final String _sql = "SELECT * FROM diary_record WHERE date = ? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final Long _tmp;
    _tmp = __converters.dateToTimestamp(date_input);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
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
      final diary_record _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final Date _tmpDate;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfDate);
        }
        _tmpDate = __converters.fromTimestamp(_tmp_1);
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
        _result = new diary_record(_tmpId,_tmpDate,_tmpItem,_tmpEnergy,_tmpProtein,_tmpTotal_lipid,_tmpCarbohydrate,_tmpFiber,_tmpSugar,_tmpNa,_tmpSaturated_fatty_acids,_tmpTrans_fatty_acids,_tmpCholesterol);
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
