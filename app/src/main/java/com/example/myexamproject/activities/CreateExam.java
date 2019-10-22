package com.example.myexamproject.activities;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myexamproject.R;
import com.example.myexamproject.adapeters.CreateExamAdapter;
import com.example.myexamproject.database.model.UserCreateExam;
import com.example.myexamproject.viewModel.MyViewModel;

import java.util.List;

public class CreateExam extends Fragment {

    private EditText mName;
    private Button mSave;
    private RecyclerView mCreateExamRecyclerView;
    private MyViewModel mMyViewModel;
    CreateExamAdapter mCreateExamAdapter;

    public CreateExam() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_exam, container, false);

        mName = view.findViewById(R.id.etName);
        mSave = view.findViewById(R.id.btnSave);
        mCreateExamRecyclerView = view.findViewById(R.id.rvCreateExam);

        mMyViewModel = ViewModelProviders.of(this).get(MyViewModel.class);

        mCreateExamAdapter = new CreateExamAdapter();
        mCreateExamRecyclerView.setAdapter(mCreateExamAdapter);
        mCreateExamRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mMyViewModel.getRecievedData().observe(this, new Observer<List<UserCreateExam>>() {
            @Override
            public void onChanged(List<UserCreateExam> data) {
                mCreateExamAdapter.addCreateExam(data);
            }
        });

        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "ذخیره شد", Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}
