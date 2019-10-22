package com.example.myexamproject.database.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserCreateExam {

    @PrimaryKey()
    @NonNull
    private String mName;

    private String mQuestion, mChoice1, mChoice2, mChoice3, mChoice4;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public String getChoice1() {
        return mChoice1;
    }

    public void setChoice1(String choice1) {
        mChoice1 = choice1;
    }

    public String getChoice2() {
        return mChoice2;
    }

    public void setChoice2(String choice2) {
        mChoice2 = choice2;
    }

    public String getChoice3() {
        return mChoice3;
    }

    public void setChoice3(String choice3) {
        mChoice3 = choice3;
    }

    public String getChoice4() {
        return mChoice4;
    }

    public void setChoice4(String choice4) {
        mChoice4 = choice4;
    }

    public UserCreateExam(String name, String question, String choice1,
                          String choice2, String choice3, String choice4) {
        mName = name;
        mQuestion = question;
        mChoice1 = choice1;
        mChoice2 = choice2;
        mChoice3 = choice3;
        mChoice4 = choice4;
    }
}
