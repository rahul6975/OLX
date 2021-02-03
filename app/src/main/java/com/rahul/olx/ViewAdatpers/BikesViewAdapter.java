package com.rahul.olx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.olx.BikesResponseClasses.DataClass;
import com.rahul.olx.JobsReponseClasses.DataJobClasses;
import com.rahul.olx.R;
import com.rahul.olx.ViewHolders.BikesViewHolder;

import java.util.List;

public class BikesViewAdapter extends RecyclerView.Adapter<BikesViewHolder> {
    private List<DataClass> dataClassList;

    public BikesViewAdapter(List<DataClass> dataClassList) {
        this.dataClassList = dataClassList;
    }

    @NonNull
    @Override
    public BikesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.browse_category_on_click_items, parent, false);
        return new BikesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BikesViewHolder holder, int position) {
        DataClass dataClass = dataClassList.get(position);
        holder.setData(dataClass);
    }

    @Override
    public int getItemCount() {
        return dataClassList.size();
    }

    public void updateData(List<DataClass> dataJobClassesList) {
        this.dataClassList = dataJobClassesList;
        notifyDataSetChanged();
    }
}
