package com.rahul.olx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.olx.BikesResponseClasses.DataClass;
import com.rahul.olx.R;
import com.rahul.olx.ViewHolders.BikeViewHolder;

import java.util.ArrayList;
import java.util.List;

public class BikeViewAdapter extends RecyclerView.Adapter<BikeViewHolder> {
    private List<DataClass> dataClassArrayList;

    public BikeViewAdapter(List<DataClass> dataClassArrayList) {
        this.dataClassArrayList = dataClassArrayList;
    }

    @NonNull
    @Override
    public BikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bikes_recycler_view_items,parent,false);
        return new BikeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BikeViewHolder holder, int position) {
        DataClass dataClass = dataClassArrayList.get(position);
        holder.setData(dataClass);
    }

    @Override
    public int getItemCount() {
        return dataClassArrayList.size();
    }

    public void updateData(List<DataClass> dataClasses)
    {
        this.dataClassArrayList = dataClasses;
        notifyDataSetChanged();
    }
}
