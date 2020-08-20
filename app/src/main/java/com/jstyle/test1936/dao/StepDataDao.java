package com.jstyle.test1936.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.jstyle.test1963.model.StepData;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "STEP_DATA".
*/
public class StepDataDao extends AbstractDao<StepData, String> {

    public static final String TABLENAME = "STEP_DATA";

    /**
     * Properties of entity StepData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Step = new Property(0, String.class, "step", false, "STEP");
        public final static Property Cal = new Property(1, String.class, "cal", false, "CAL");
        public final static Property Distance = new Property(2, String.class, "distance", false, "DISTANCE");
        public final static Property ExerciseTime = new Property(3, String.class, "exerciseTime", false, "EXERCISE_TIME");
        public final static Property Address = new Property(4, String.class, "address", false, "ADDRESS");
        public final static Property Time = new Property(5, String.class, "time", false, "TIME");
        public final static Property Goal = new Property(6, String.class, "goal", false, "GOAL");
        public final static Property Date = new Property(7, String.class, "date", true, "DATE");
    }


    public StepDataDao(DaoConfig config) {
        super(config);
    }
    
    public StepDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"STEP_DATA\" (" + //
                "\"STEP\" TEXT," + // 0: step
                "\"CAL\" TEXT," + // 1: cal
                "\"DISTANCE\" TEXT," + // 2: distance
                "\"EXERCISE_TIME\" TEXT," + // 3: exerciseTime
                "\"ADDRESS\" TEXT," + // 4: address
                "\"TIME\" TEXT," + // 5: time
                "\"GOAL\" TEXT," + // 6: goal
                "\"DATE\" TEXT PRIMARY KEY NOT NULL );"); // 7: date
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"STEP_DATA\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, StepData entity) {
        stmt.clearBindings();
 
        String step = entity.getStep();
        if (step != null) {
            stmt.bindString(1, step);
        }
 
        String cal = entity.getCal();
        if (cal != null) {
            stmt.bindString(2, cal);
        }
 
        String distance = entity.getDistance();
        if (distance != null) {
            stmt.bindString(3, distance);
        }
 
        String exerciseTime = entity.getExerciseTime();
        if (exerciseTime != null) {
            stmt.bindString(4, exerciseTime);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(5, address);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(6, time);
        }
 
        String goal = entity.getGoal();
        if (goal != null) {
            stmt.bindString(7, goal);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(8, date);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, StepData entity) {
        stmt.clearBindings();
 
        String step = entity.getStep();
        if (step != null) {
            stmt.bindString(1, step);
        }
 
        String cal = entity.getCal();
        if (cal != null) {
            stmt.bindString(2, cal);
        }
 
        String distance = entity.getDistance();
        if (distance != null) {
            stmt.bindString(3, distance);
        }
 
        String exerciseTime = entity.getExerciseTime();
        if (exerciseTime != null) {
            stmt.bindString(4, exerciseTime);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(5, address);
        }
 
        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(6, time);
        }
 
        String goal = entity.getGoal();
        if (goal != null) {
            stmt.bindString(7, goal);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(8, date);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7);
    }    

    @Override
    public StepData readEntity(Cursor cursor, int offset) {
        StepData entity = new StepData( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // step
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // cal
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // distance
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // exerciseTime
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // address
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // time
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // goal
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // date
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, StepData entity, int offset) {
        entity.setStep(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setCal(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDistance(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setExerciseTime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAddress(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTime(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setGoal(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setDate(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final String updateKeyAfterInsert(StepData entity, long rowId) {
        return entity.getDate();
    }
    
    @Override
    public String getKey(StepData entity) {
        if(entity != null) {
            return entity.getDate();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(StepData entity) {
        return entity.getDate() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}