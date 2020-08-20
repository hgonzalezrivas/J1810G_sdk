package com.jstyle.test1963.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.jstyle.test1963.model.HeartData;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HEART_DATA".
*/
public class HeartDataDao extends AbstractDao<HeartData, String> {

    public static final String TABLENAME = "HEART_DATA";

    /**
     * Properties of entity HeartData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Time = new Property(0, String.class, "time", true, "TIME");
        public final static Property Heart = new Property(1, int.class, "heart", false, "HEART");
        public final static Property Address = new Property(2, String.class, "address", false, "ADDRESS");
    }


    public HeartDataDao(DaoConfig config) {
        super(config);
    }
    
    public HeartDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HEART_DATA\" (" + //
                "\"TIME\" TEXT PRIMARY KEY NOT NULL ," + // 0: time
                "\"HEART\" INTEGER NOT NULL ," + // 1: heart
                "\"ADDRESS\" TEXT);"); // 2: address
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HEART_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, HeartData entity) {
        stmt.clearBindings();
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(1, time);
        }
        stmt.bindLong(2, entity.getHeart());
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(3, address);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, HeartData entity) {
        stmt.clearBindings();
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(1, time);
        }
        stmt.bindLong(2, entity.getHeart());
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(3, address);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public HeartData readEntity(Cursor cursor, int offset) {
        HeartData entity = new HeartData( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // time
            cursor.getInt(offset + 1), // heart
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // address
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, HeartData entity, int offset) {
        entity.setTime(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setHeart(cursor.getInt(offset + 1));
        entity.setAddress(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final String updateKeyAfterInsert(HeartData entity, long rowId) {
        return entity.getTime();
    }
    
    @Override
    public String getKey(HeartData entity) {
        if(entity != null) {
            return entity.getTime();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(HeartData entity) {
        return entity.getTime() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}