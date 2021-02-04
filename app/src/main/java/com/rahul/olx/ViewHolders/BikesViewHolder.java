package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.BikesResponseClasses.DataClass;
import com.rahul.olx.CarResponseClasses.DataCarClasses;
import com.rahul.olx.ClickListeners.BikeClickListener;
import com.rahul.olx.R;

public class BikesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvBikePrice, tvBikeTitle, tvBikeTown, tvBikeCity ,tvExtraBike;
    private ImageView imgBikeCoverImage, imgBikeheart;
    private ConstraintLayout constraintLayout;
    private BikeClickListener bikeClickListener;
    public BikesViewHolder(@NonNull View itemView, BikeClickListener bikeClickListener) {
        super(itemView);
        this.bikeClickListener = bikeClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        tvBikePrice = itemView.findViewById(R.id.PriceOfBrowseCategory);
        tvBikeTitle = itemView.findViewById(R.id.TitleOfBrowseCategory);
        tvExtraBike = itemView.findViewById(R.id.ExtrasOfBrowseCategory);
        constraintLayout = itemView.findViewById(R.id.constraintLayout);
        tvBikeTown = itemView.findViewById(R.id.tvTownOfBrowseCategory);
        tvBikeCity = itemView.findViewById(R.id.CityOfBrowseCategory);
        imgBikeCoverImage = itemView.findViewById(R.id.imgInBrowseCategory);
        imgBikeheart = itemView.findViewById(R.id.imgBrowseCategoryHeart);
        imgBikeheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgBikeheart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }
    public void setData(DataClass dataClass) {
        try {
            tvBikePrice.setText(dataClass.getPrice().getValue().getDisplay());
            tvBikeTitle.setText(dataClass.getTitle());
            tvExtraBike.setText(dataClass.getMainInfo());
            tvBikeTown.setText(dataClass.getLocationsResolved().getADMINLEVEL3Name());
            tvBikeCity.setText(dataClass.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgBikeCoverImage).load(dataClass.getImages().get(0).getUrl()).into(imgBikeCoverImage);
        }
        catch (Exception e)
        {
            tvExtraBike.setText("");
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bikeClickListener.onClick(dataClass);
            }
        });
    }
}
