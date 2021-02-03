package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul.olx.ClickListeners.BrowseCategoryClickListener;
import com.rahul.olx.ModelClasses.BrowseCategoriesModelClass;
import com.rahul.olx.R;

public class BrowseCategoriesViewHolder extends RecyclerView.ViewHolder {

    private ImageView imgCategory;
    private LinearLayout ll;
    private TextView tvCategoryName;
    private BrowseCategoryClickListener browseCategoryClickListener;

    public BrowseCategoriesViewHolder(@NonNull View itemView, BrowseCategoryClickListener browseCategoryClickListener) {
        super(itemView);
        this.browseCategoryClickListener = browseCategoryClickListener;
        init(itemView);
    }

    private void init(View itemView) {
        imgCategory = itemView.findViewById(R.id.imgCategoies);
        ll = itemView.findViewById(R.id.LL);
        tvCategoryName = itemView.findViewById(R.id.tvCategoryName);
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(browseCategoryClickListener != null)
                {
                    int position = getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION)
                    {
                        browseCategoryClickListener.onItemClick(position);
                    }
                }
            }
        });
    }

    public void setData(BrowseCategoriesModelClass modelClass)
    {
        imgCategory.setImageResource(modelClass.getImage());
        tvCategoryName.setText(modelClass.getName());
    }
}
