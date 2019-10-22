package com.example.myexamproject.adapeters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myexamproject.R;

public class TakeExamAdapter extends RecyclerView.Adapter<TakeExamAdapter.TakeExamViewHolder> {


    @NonNull
    @Override
    public TakeExamAdapter.TakeExamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.take_exam_item, parent, false);
        return new TakeExamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TakeExamAdapter.TakeExamViewHolder holder, int position) {
        holder.bind1();
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class TakeExamViewHolder extends RecyclerView.ViewHolder {
            private TextView mName;

        public TakeExamViewHolder(@NonNull View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.tvName);
        }

        public void bind1() {

        }
    }
}
