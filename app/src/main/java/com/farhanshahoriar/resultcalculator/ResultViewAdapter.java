package com.farhanshahoriar.resultcalculator;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResultViewAdapter extends RecyclerView.Adapter<ResultViewAdapter.ResultViewHolder> {

    public IndividualResult[] resultData = null;
    @Override
    public void onBindViewHolder(@NonNull ResultViewHolder resultViewHolder, int pos) {
        String strData= resultData[pos].oldRoll+" \t"+ resultData[pos].nickName+" \t"+ resultData[pos].totalMarks;
        resultViewHolder.resultTextView.setText(strData);
    }

    @Override
    public int getItemCount() {
        if(resultData == null)return 0;
        else return resultData.length;
    }

    public class ResultViewHolder extends RecyclerView.ViewHolder{
        TextView resultTextView;

        public ResultViewHolder(View view){
            super(view);
            resultTextView = (TextView) view.findViewById(R.id.tv_item_text);
        }

    }
    @Override
    public ResultViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.result_item, viewGroup,false);
        return new ResultViewHolder(view);
    }

    public void setData(IndividualResult[] data){
        resultData = data;
        notifyDataSetChanged();
    }
}

