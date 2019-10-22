package com.example.myexamproject.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.myexamproject.database.model.UserCreateExam;
import com.example.myexamproject.repositories.CreateExamRepo;

import java.util.List;

public class MyViewModel extends AndroidViewModel {
    private LiveData<List<UserCreateExam>> mRecievedData;
    private CreateExamRepo mCreateExamRepo;

    public MyViewModel(@NonNull Application application) {
        super(application);
        mRecievedData = new MutableLiveData<>();
        mRecievedData = mCreateExamRepo.getAllCreateExams();
    }

    public LiveData<List<UserCreateExam>> getRecievedData() {
        return mRecievedData;
    }

    public void addCreateExam(UserCreateExam userCreateExam) {
        mCreateExamRepo.addCreateExam(userCreateExam);
    }
}
