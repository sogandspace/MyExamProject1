package com.example.myexamproject.database.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.myexamproject.database.model.UserCreateExam;

import java.util.List;

@Dao
public interface CreateExamDao {

    @Query("SELECT * FROM UserCreateExam")
    LiveData<List<UserCreateExam>> getAllExams();

    @Insert
    void insert(UserCreateExam userCreateExam);

}
