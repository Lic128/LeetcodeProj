package com.example.liyan.leetcodeproj.adapter;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        View cellTitle;
        View cellContent;
        View problemItem;
//        ImageView iconImp;
        public ViewHolder(View view){
            super(view);
            cellContent= view.findViewById(R.id.cell_content);
            cellTitle= view.findViewById(R.id.cell_title);
            problemItem=view.findViewById(R.id.problem_item);
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
                (v)->{
                    holder.fc.toggle(false);
                    Toast.makeText(v.getContext(), "You Clicked view", Toast.LENGTH_SHORT).show();
                }
        );
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Problem problem= mProblemList.get(position);
        TextView problemTitle1=holder.cellTitle.findViewById(R.id.problem_title);
        TextView problemTopic1=holder.cellTitle.findViewById(R.id.problem_topic);
        TextView problemTitle2=holder.cellContent.findViewById(R.id.problem_title);
        TextView problemTopic2=holder.cellContent.findViewById(R.id.problem_topic);
        problemTitle1.setText(problem.getTitle());
        problemTitle2.setText(problem.getTitle());
        problemTopic1.setText("Array");
        problemTopic2.setText("Array");
    }

    @Override
    public int getItemCount(){
        return mProblemList.size();
    }

}
