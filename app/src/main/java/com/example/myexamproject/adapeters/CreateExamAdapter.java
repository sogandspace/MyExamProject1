package com.example.myexamproject.adapeters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myexamproject.R;
import com.example.myexamproject.database.model.UserCreateExam;

import java.util.List;

public class CreateExamAdapter extends RecyclerView.Adapter<CreateExamAdapter.CreateExamViewHOlder> {

    private List<UserCreateExam> mData;

    public void addCreateExam(List<UserCreateExam> data) {
        mData = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CreateExamViewHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.create_exam_item, parent, false);
        return new CreateExamViewHOlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CreateExamViewHOlder holder, int position) {
        holder.bind(mData.get(position));

    }

    @Override
    public int getItemCount() {
        return mData==null ? mData.size() : 0;
    }

    public class CreateExamViewHOlder extends RecyclerView.ViewHolder {

        private EditText mQuestion, mFirstChoice, mSecondchoice, mThirdchoice, mForthChoice;

        public CreateExamViewHOlder(@NonNull View itemView) {
            super(itemView);
            mQuestion = itemView.findViewById(R.id.etQues);
            mFirstChoice = itemView.findViewById(R.id.etQues1);
            mSecondchoice = itemView.findViewById(R.id.etQues2);
            mThirdchoice = itemView.findViewById(R.id.etQues3);
            mForthChoice = itemView.findViewById(R.id.etQues4);
        }
        public void bind(UserCreateExam data) {
            mQuestion.setText(data.getQuestion());
            mFirstChoice.setText(data.getChoice1());
            mSecondchoice.setText(data.getChoice2());
            mThirdchoice.setText(data.getChoice3());
            mFirstChoice.setText(data.getChoice4());
        }
    }
}

