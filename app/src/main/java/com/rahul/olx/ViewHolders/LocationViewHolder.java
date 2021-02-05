package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.olx.Activities.LocationModelClass;
import com.rahul.olx.R;

public class LocationViewHolder extends RecyclerView.ViewHolder {
    private TextView tvState;

    public LocationViewHolder(@NonNull View itemView) {
        super(itemView);
        init(itemView);
    }

    private void init(View itemView) {
        tvState = itemView.findViewById(R.id.tvState);
    }
    public  void setData(LocationModelClass modelClass)
    {
        tvState.setText(modelClass.getState());
    }
}
