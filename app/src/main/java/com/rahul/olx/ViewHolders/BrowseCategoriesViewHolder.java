package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.olx.ModelClasses.BrowseCategoriesModelClass;
import com.rahul.olx.R;

public class BrowseCategoriesViewHolder extends RecyclerView.ViewHolder {

    private ImageView imgCategory;
    private TextView tvCategoryName;

    public BrowseCategoriesViewHolder(@NonNull View itemView) {
        super(itemView);
        init(itemView);
    }

    private void init(View itemView) {
        imgCategory = itemView.findViewById(R.id.imgCategoies);
        tvCategoryName = itemView.findViewById(R.id.tvCategoryName);
    }

    public void setData(BrowseCategoriesModelClass modelClass)
    {
        imgCategory.setImageResource(modelClass.getImage());
        tvCategoryName.setText(modelClass.getName());
    }
}
