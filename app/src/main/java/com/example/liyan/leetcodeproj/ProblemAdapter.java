package com.example.liyan.leetcodeproj;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ramotion.foldingcell.FoldingCell;

import java.util.List;

/**
 * Created by liyan on 2/5/18.
 */

public class ProblemAdapter extends RecyclerView.Adapter<ProblemAdapter.ViewHolder> {
    private List<Problem> mProblemList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        FoldingCell fc;
        TextView titleView;
        View problemDifficulty;
        View problemItem;
        TextView problemRate;
        public ViewHolder(View view){
            super(view);
            titleView= view.findViewById(R.id.title);
            problemDifficulty= view.findViewById(R.id.problem_difficulty);
            problemItem=view.findViewById(R.id.problem_item);
            problemRate= view.findViewById(R.id.problem_acceptRate);
            fc= view.findViewById(R.id.folding_cell);
        }
    }
    public ProblemAdapter(List<Problem> problemList){
        mProblemList= problemList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.problem_item, parent, false);
        final ViewHolder holder=new ViewHolder(view);
//        holder.problemItem.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                int position= holder.getAdapterPosition();
//                Problem problem=mProblemList.get(position);
//                Toast.makeText(v.getContext(), "you clicked view"+problem.getTitle(), Toast.LENGTH_SHORT).show();
//            }
//        });
        holder.fc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        holder.fc.toggle(false);
                    }
                }
        );
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Problem problem= mProblemList.get(position);
        //holder.descriptionView.setText(problem.getDescription());
        holder.titleView.setText(problem.getTitle());
        String difficulty=problem.getDifficulty();
        if(difficulty.equals("Hard")){
            holder.problemDifficulty.setBackgroundColor(Color.parseColor("#D9534F"));
        }else if(difficulty.equals("Medium")){
            holder.problemDifficulty.setBackgroundColor(Color.parseColor("#F0AD4E"));
        }else{
            holder.problemDifficulty.setBackgroundColor(Color.parseColor("#5CB85C"));
        }
        holder.problemRate.setText("Accept Rate:"+problem.getAcceptRate()+"");
    }

    @Override
    public int getItemCount(){
        return mProblemList.size();
    }
}
