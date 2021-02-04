package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.CarResponseClasses.DataCarClasses;
import com.rahul.olx.ClickListeners.ElectronicsClickListener;
import com.rahul.olx.ElectronicsResponseClasses.DataElectronicClasses;
import com.rahul.olx.R;

public class ElectronicsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvElectronicsPrice, tvElectronicsTitle, tvElectronicsTown, tvElectronicsCity ,tvExtraElectronics;
    private ImageView imgElectronicsCoverImage, imgElectronicsHeart;
    private ElectronicsClickListener electronicsClickListener;
    private ConstraintLayout constraintLayout;


    public ElectronicsViewHolder(@NonNull View itemView, ElectronicsClickListener electronicsClickListener) {
        super(itemView);
        this.electronicsClickListener =electronicsClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        tvElectronicsPrice = itemView.findViewById(R.id.PriceOfBrowseCategory);
        constraintLayout = itemView.findViewById(R.id.constraintLayout);
        tvElectronicsTitle = itemView.findViewById(R.id.TitleOfBrowseCategory);
        tvExtraElectronics = itemView.findViewById(R.id.ExtrasOfBrowseCategory);
        tvElectronicsTown = itemView.findViewById(R.id.tvTownOfBrowseCategory);
        tvElectronicsCity = itemView.findViewById(R.id.CityOfBrowseCategory);
        imgElectronicsCoverImage = itemView.findViewById(R.id.imgInBrowseCategory);
        imgElectronicsHeart = itemView.findViewById(R.id.imgBrowseCategoryHeart);
        imgElectronicsHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgElectronicsHeart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }

    public void setData(DataElectronicClasses dataElectronicClasses) {
        try {
            tvElectronicsPrice.setText(dataElectronicClasses.getPrice().getValue().getDisplay());
            tvElectronicsTitle.setText(dataElectronicClasses.getTitle());
//            tvExtraElectronics.setText(dataElectronicClasses.getMainInfo());
            tvElectronicsTown.setText(dataElectronicClasses.getLocationsResolved().getADMINLEVEL3Name());
            tvElectronicsCity.setText(dataElectronicClasses.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgElectronicsCoverImage).load(dataElectronicClasses.getImages().get(0).getUrl()).into(imgElectronicsCoverImage);
        }
        catch (Exception e)
        {
            tvExtraElectronics.setText("");
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                electronicsClickListener.onClick(dataElectronicClasses);
            }
        });
    }
}
