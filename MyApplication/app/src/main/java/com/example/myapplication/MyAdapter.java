package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    List<String> topics = new ArrayList<>();
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rowView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);
        topics.add(("Maths"));
        topics.add(("Science"));
        return new MyViewHolder(rowView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
       holder.topic.setText(  topics.get(position));
    }

    @Override
    public int getItemCount() {
        return topics.size();
    }
    static  class MyViewHolder extends RecyclerView.ViewHolder{
        TextView topic;
        public MyViewHolder(View itemView){
            super((itemView));
            topic = itemView.findViewById(R.id.topic);
        }
    }
}
