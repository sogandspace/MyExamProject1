package com.example.myexamproject.activities;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myexamproject.R;

public class FragmentMain extends Fragment {

    private Button mBtnCreateExam, mBtnTakeExam;
    private NavController mNavController;

    public FragmentMain() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mBtnTakeExam = view.findViewById(R.id.btn_take_exam);

        view.findViewById(R.id.btn_create_exam).setOnClickListener
                    (Navigation.createNavigateOnClickListener
                        (R.id.action_fragmentMain_to_createExam, null));

        mBtnTakeExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mNavController.getCurrentDestination() != null &&
                        mNavController.getCurrentDestination().getId() == R.id.fragmentMain) {
                    mNavController.navigate(R.id.action_fragmentMain_to_takeExam);
//                Fragment takeExam = new TakeExam();
//                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.replace(R.id.fragmentMain, takeExam);
//                fragmentTransaction.addToBackStack(null);
//                fragmentTransaction.commit();
                }
            }
        });
        return view;
    }
}
