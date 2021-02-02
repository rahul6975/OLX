package com.rahul.olx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.olx.ModelClasses.BrowseCategoriesModelClass;
import com.rahul.olx.R;
import com.rahul.olx.ViewHolders.BrowseCategoriesViewHolder;

import java.util.ArrayList;

public class BrowseCategoriesAdapter extends RecyclerView.Adapter<BrowseCategoriesViewHolder> {

    private ArrayList<BrowseCategoriesModelClass> modelClassArrayList;

    public BrowseCategoriesAdapter(ArrayList<BrowseCategoriesModelClass> modelClassArrayList) {
        this.modelClassArrayList = modelClassArrayList;
    }

    @NonNull
    @Override
    public BrowseCategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.browse_categories_items,parent,false);
        return new BrowseCategoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BrowseCategoriesViewHolder holder, int position) {
        BrowseCategoriesModelClass modelClass = modelClassArrayList.get(position);
        holder.setData(modelClass);

    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }
}
