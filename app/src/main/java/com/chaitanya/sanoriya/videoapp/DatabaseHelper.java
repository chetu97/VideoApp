package com.chaitanya.sanoriya.videoapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by WildFire on 20-12-2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NANE = "video_app.db";
    private static final String TABLE_NAME = "preferences";
    private static final String col1 = "preference";

    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NANE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table " + TABLE_NAME + "(" + col1 + " TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP table if exists " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(ArrayList<String> arrayList)
    {
        int count = arrayList.size();
        long result = 0;
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DROP table if exists " + TABLE_NAME);
        onCreate(db);
        ContentValues contentValues = new ContentValues();
        for (int i = 0; i < count; i++)
        {
            contentValues.put(col1, arrayList.get(i));
            result = db.insert(TABLE_NAME, null, contentValues);
        }
        if (result <0)
        {
            return false;
        } else
        {
            return true;
        }
    }

    public boolean checkdata()
    {
        int count = 0;
        try
        {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
            count = res.getCount();
        } catch (Exception e)
        {
            count =0;
        }
        if (count < 3)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public Cursor getData()
    {
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
            return res;
    }
}
