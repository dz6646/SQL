package com.example.sqlandcrying;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class HelperDB extends SQLiteOpenHelper {
    public HelperDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        createStudents(sqLiteDatabase);
        createGrades(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void createGrades(SQLiteDatabase db)
    {
        String strCreate = "CREATE TABLE IF NOT EXISTS " + Grades.TABLE_GRADES;
        strCreate += " (" + Grades.KEY_PHONE_NUMBER + " TEXT PRIMARY KET NOT NULL,";
        strCreate += " " + Grades.QUARTER + " INTEGER,";
        strCreate += " " + Grades.SUBJECT + " TEXT NOT NULL,";
        strCreate += " " + Grades.GRADE + " INTEGER);";

    }

    public void createStudents(SQLiteDatabase db)
    {
        String strCreate = "CREATE TABLE IF NOT EXISTS " + Students.TABLE_STUDENTS;
        strCreate += " (" + Students.KEY_PHONE_NUMBER + " TEXT PRIMARY KEY NOT NULL,";
        strCreate += " " + Students.NAME + " TEXT NOT NULL,";
        strCreate += " " + Students.ADDRESS + " TEXT NOT NULL,";
        strCreate += " " + Students.IS_ACTIVE + " INTEGER,";
        strCreate += " " + Students.DAD_NAME + " TEXT NOT NULL,";
        strCreate += " " + Students.DAD_PHONE + " TEXT NOT NULL,";
        strCreate += " " + Students.MOM_NAME + " TEXT NOT NULL,";
        strCreate += " " + Students.MOM_PHONE + " TEXT NOT NULL,";
        strCreate += " " + Students.HOME_PHONE + " TEXT NOT NULL);";
    }
}
