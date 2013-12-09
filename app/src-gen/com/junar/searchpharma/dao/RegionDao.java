package com.junar.searchpharma.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.junar.searchpharma.Region;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * DAO for table REGION.
 */
public class RegionDao extends AbstractDao<Region, Long> {

    public static final String TABLENAME = "REGION";

    /**
     * Properties of entity Region.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id",
                true, "_id");
        public final static Property Code = new Property(1, Integer.class,
                "code", false, "CODE");
        public final static Property Name = new Property(2, String.class,
                "name", false, "NAME");
    };

    public RegionDao(DaoConfig config) {
        super(config);
    }

    public RegionDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'REGION' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'CODE' INTEGER," + // 1: code
                "'NAME' TEXT);"); // 2: name
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "")
                + "'REGION'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Region entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        Integer code = entity.getCode();
        if (code != null) {
            stmt.bindLong(2, code);
        }

        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /** @inheritdoc */
    @Override
    public Region readEntity(Cursor cursor, int offset) {
        Region entity = new Region( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // code
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // name
        );
        return entity;
    }

    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Region entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor
                .getLong(offset + 0));
        entity.setCode(cursor.isNull(offset + 1) ? null : cursor
                .getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor
                .getString(offset + 2));
    }

    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Region entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /** @inheritdoc */
    @Override
    public Long getKey(Region entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}