package com.rahul.olx.ViewAdatpers;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.olx.Activities.LocationModelClass;
import com.rahul.olx.R;
import com.rahul.olx.ViewHolders.LocationViewHolder;

import java.util.List;

public class LocationViewAdapter extends RecyclerView.Adapter<LocationViewHolder> {

    private List<LocationModelClass> locationModelClassList;

    public LocationViewAdapter(List<LocationModelClass> locationModelClassList) {
        this.locationModelClassList = locationModelClassList;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.location_recycler_view, parent, false);
        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        LocationModelClass locationModelClass = locationModelClassList.get(position);
        holder.setData(locationModelClass);

    }

    @Override
    public int getItemCount() {
        return locationModelClassList.size();
    }
}
