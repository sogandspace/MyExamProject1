package com.example.myexamproject.repositories;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.example.myexamproject.database.MyDatabase;
import com.example.myexamproject.database.daos.CreateExamDao;
import com.example.myexamproject.database.model.UserCreateExam;

import java.util.List;

public class TakeExamRepo {

    private LiveData<List<UserCreateExam>> mAllTakeExam;

    CreateExamDao mCreateExamDao;

    private static CreateExamRepo sInstance;

    public TakeExamRepo (@NonNull Application application) {
        MyDatabase myDatabase = MyDatabase.getDatabase(application);
        mCreateExamDao = myDatabase.mCreateExamDao();
        mAllTakeExam = mCreateExamDao.getAllExams();
    }
}
