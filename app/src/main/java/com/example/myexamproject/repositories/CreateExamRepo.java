package com.example.myexamproject.repositories;

import android.app.Application;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.example.myexamproject.database.MyDatabase;
import com.example.myexamproject.database.daos.CreateExamDao;
import com.example.myexamproject.database.model.UserCreateExam;

import java.util.List;

public class CreateExamRepo {
    //Live Data of List of all createExam
    private LiveData<List<UserCreateExam>> mAllCreateExams;
    //Define createExam Dao
    CreateExamDao mCreateExamDao;
    private static CreateExamRepo mInstance;

    private CreateExamRepo(@NonNull Application application) {
        MyDatabase myDatabase = MyDatabase.getDatabase(application);
        mCreateExamDao = myDatabase.mCreateExamDao();
        mAllCreateExams = mCreateExamDao.getAllExams();
    }

    //method to get all createExams
    public LiveData<List<UserCreateExam>> getAllCreateExams() { return mAllCreateExams; }

    //method to add createExam
    public void addCreateExam(UserCreateExam userCreateExam) {
        new AddCreateExam().execute(userCreateExam);
    }

    //Async task to add createExam
    public class AddCreateExam extends AsyncTask<UserCreateExam, Void, Void> {
        @Override
        protected Void doInBackground(UserCreateExam... notes) {
            mCreateExamDao.insert(notes[0]);
            return null;
        }
    }
}
