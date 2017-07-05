package com.example.adil.academic_guidance;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Adil on 1/19/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "accademic_guidance.db";
    private static final String TABLE_NAME = "contacts";
    private static final String TABLE_NAME_POST = "userpost";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_UNAME = "uname";
    private static final String COLUMN_PASS = "pass";
    public static final String COLUMN_TIME_STAMP = "timeStamp";

    public static final String COL1 = "ID";
    public static final String COL2 = "ITEM1";
    SQLiteDatabase db;


    private static final String TABLE_CREATE = "create table contacts(id integer primary key not null , " +
            "name text not null , uname text not null , pass text not null);";


    private static final String createTable = "CREATE TABLE " + TABLE_NAME_POST + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            " ITEM1 TEXT)";



    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(TABLE_CREATE);
        db.execSQL(createTable);
        this.db = db;

    }

    public boolean addData(String item1) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL2, item1);

        long result = db.insert(TABLE_NAME_POST, null, contentValues);

        //if date as inserted incorrectly it will return -1
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
    public Cursor getListContents(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " + TABLE_NAME_POST, null);
        return data;
    }

    public void insertContact(Contact c)
    {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        String query = "select * from contacts";
        Cursor cursor = db.rawQuery(query,null);
        int count = cursor.getCount();

        values.put(COLUMN_ID,count);
        values.put(COLUMN_NAME,c.getName());
        values.put(COLUMN_UNAME,c.getUname());
        values.put(COLUMN_PASS,c.getPass());
        db.insert(TABLE_NAME, null, values);
    }

    public String searchPass(String uname)
    {
        db = this.getReadableDatabase();
        String query = "select uname, pass from "+TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        String a,b;
        b = "not found";
        if(cursor.moveToFirst())
        {
            do
            {
                a = cursor.getString(0);
                if(a.equals(uname))
                {
                    b = cursor.getString(1);
                    break;
                }
            }
            while(cursor.moveToNext());
        }
        return b;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        String query = "DROP TABLE IF EXISTS "+TABLE_NAME;
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_POST);

        db.execSQL(query);
        this.onCreate(db);

    }
}
