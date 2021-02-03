package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.CarResponseClasses.DataCarClasses;
import com.rahul.olx.MumbaiResponseClasses.DataMumbaiClasses;
import com.rahul.olx.R;

public class CarsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCarPrice, tvCarTitle, tvCarTown, tvCarCity ,tvExtraCar;
    private ImageView imgCarCoverImage, imgCarheart;

    public CarsViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }
    private void initView(View itemView) {
        tvCarPrice = itemView.findViewById(R.id.PriceOfBrowseCategory);
        tvCarTitle = itemView.findViewById(R.id.TitleOfBrowseCategory);
        tvExtraCar = itemView.findViewById(R.id.ExtrasOfBrowseCategory);
        tvCarTown = itemView.findViewById(R.id.tvTownOfBrowseCategory);
        tvCarCity = itemView.findViewById(R.id.CityOfBrowseCategory);
        imgCarCoverImage = itemView.findViewById(R.id.imgInBrowseCategory);
        imgCarheart = itemView.findViewById(R.id.imgBrowseCategoryHeart);
        imgCarheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCarheart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }

    public void setData(DataCarClasses dataCarClasses) {
        try {
            tvCarPrice.setText(dataCarClasses.getPrice().getValue().getDisplay());
            tvCarTitle.setText(dataCarClasses.getTitle());
            tvExtraCar.setText(dataCarClasses.getMainInfo());
            tvCarTown.setText(dataCarClasses.getLocationsResolved().getADMINLEVEL3Name());
            tvCarCity.setText(dataCarClasses.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgCarCoverImage).load(dataCarClasses.getImages().get(0).getUrl()).into(imgCarCoverImage);
        }
        catch (Exception e)
        {
            tvExtraCar.setText("");
        }
    }
}
