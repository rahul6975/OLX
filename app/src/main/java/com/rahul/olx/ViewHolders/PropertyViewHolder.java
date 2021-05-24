package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.CarResponseClasses.DataCarClasses;
import com.rahul.olx.ClickListeners.PropertyClickListener;
import com.rahul.olx.PropertiesResponseClasses.DataPropertyClasses;
import com.rahul.olx.R;

public class PropertyViewHolder extends RecyclerView.ViewHolder {
    private PropertyClickListener propertyClickListener;
    private ConstraintLayout constraintLayout;
    private TextView tvPropertyPrice, tvPropertyTitle, tvPropertyTown, tvPropertyCity, tvExtraProperty;
    private ImageView imgPropertyCoverImage, imgPropertyheart;

    public PropertyViewHolder(@NonNull View itemView, PropertyClickListener propertyClickListener) {
        super(itemView);
        this.propertyClickListener = propertyClickListener;
        itemView(itemView);
    }

    private void itemView(View itemView) {
        tvPropertyPrice = itemView.findViewById(R.id.PriceOfBrowseCategory);
        tvPropertyTitle = itemView.findViewById(R.id.TitleOfBrowseCategory);
        tvExtraProperty = itemView.findViewById(R.id.ExtrasOfBrowseCategory);
        constraintLayout = itemView.findViewById(R.id.constraintLayout);
        tvPropertyTown = itemView.findViewById(R.id.tvTownOfBrowseCategory);
        tvPropertyCity = itemView.findViewById(R.id.CityOfBrowseCategory);
        imgPropertyCoverImage = itemView.findViewById(R.id.imgInBrowseCategory);
        imgPropertyheart = itemView.findViewById(R.id.imgBrowseCategoryHeart);
        imgPropertyheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgPropertyheart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }

    public void setData(DataPropertyClasses dataPropertyClasses) {
        try {
            tvPropertyPrice.setText(dataPropertyClasses.getPrice().getValue().getDisplay());
            tvPropertyTitle.setText(dataPropertyClasses.getTitle());
//            tvExtraProperty.setText(dataPropertyClasses.getMainInfo());
            tvPropertyTown.setText(dataPropertyClasses.getLocationsResolved().getADMINLEVEL3Name());
            tvPropertyCity.setText(dataPropertyClasses.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgPropertyCoverImage).load(dataPropertyClasses.getImages().get(0).getUrl()).into(imgPropertyCoverImage);
        } catch (Exception e) {
            tvExtraProperty.setText("");
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                propertyClickListener.onClick(dataPropertyClasses);
            }
        });
    }
}
