package com.example.liyan.leetcodeproj.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.liyan.leetcodeproj.R;
import com.example.liyan.leetcodeproj.model.Problem;
import com.ramotion.foldingcell.FoldingCell;

import java.util.List;

/**
 * Created by liyan on 2/5/18.
 */

public class ProblemAdapter extends RecyclerView.Adapter<ProblemAdapter.ViewHolder> {
    private List<Problem> mProblemList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        FoldingCell fc;
        TextView problemTitle;
        TextView problemTopics;
        View problemItem;
//        ImageView iconImp;
        public ViewHolder(View view){
            super(view);
            problemTitle= view.findViewById(R.id.problem_title);
            problemItem=view.findViewById(R.id.problem_item);
            problemTopics=view.findViewById(R.id.problem_topic);
//            iconImp= view.findViewById(R.id.icon_star);
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
        holder.problemTopics.setText("Array");
        holder.problemTitle.setText(problem.getTitle());
    }

    @Override
    public int getItemCount(){
        return mProblemList.size();
    }

}
