package com.example.myexamproject.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.myexamproject.database.daos.CreateExamDao;
import com.example.myexamproject.database.model.UserCreateExam;

@Database(entities = UserCreateExam.class, version = 1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {

    private static String TABLE_NAME = "createExam_db";

    //define static instance
    private static MyDatabase mInstance;

    //method to get room database
    public static MyDatabase getDatabase(Context context) {

        if (mInstance == null)
            mInstance = Room.databaseBuilder(context.getApplicationContext(),
                    MyDatabase.class, TABLE_NAME)
                    .build();

        return mInstance;
    }

    //define note dao ( data access object )
    public abstract CreateExamDao mCreateExamDao();
}
