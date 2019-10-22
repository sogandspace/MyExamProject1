package com.example.myexamproject.activities;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myexamproject.R;

public class TakeExam extends Fragment {

    private RecyclerView mTakeExamRecyclerView;

    public TakeExam() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_take_exam, container, false);
        mTakeExamRecyclerView = view.findViewById(R.id.rvTakeExam);

        return view;
    }

}
