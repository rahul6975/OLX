package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.CarResponseClasses.DataCarClasses;
import com.rahul.olx.ClickListeners.MobileClickListener;
import com.rahul.olx.MobilesResponseClasses.DataMobileClasses;
import com.rahul.olx.R;

public class MobileViewHolder extends RecyclerView.ViewHolder {
    private TextView tvMobilePrice, tvMobileTitle, tvMobileTown, tvMobileCity ,tvExtraMobile;
    private ImageView imgMobileCoverImage, imgMobileheart;
    private MobileClickListener mobileClickListener;
    private ConstraintLayout constraintLayout;


    public MobileViewHolder(@NonNull View itemView, MobileClickListener mobileClickListener) {
        super(itemView);
        this.mobileClickListener = mobileClickListener;
        initView(itemView);
    }
    private void initView(View itemView) {
        tvMobilePrice = itemView.findViewById(R.id.PriceOfBrowseCategory);
        constraintLayout = itemView.findViewById(R.id.constraintLayout);
        tvMobileTitle = itemView.findViewById(R.id.TitleOfBrowseCategory);
         tvExtraMobile= itemView.findViewById(R.id.ExtrasOfBrowseCategory);
        tvMobileTown = itemView.findViewById(R.id.tvTownOfBrowseCategory);
        tvMobileCity = itemView.findViewById(R.id.CityOfBrowseCategory);
        imgMobileCoverImage = itemView.findViewById(R.id.imgInBrowseCategory);
        imgMobileheart = itemView.findViewById(R.id.imgBrowseCategoryHeart);
        imgMobileheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgMobileheart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }
    public void setData(DataMobileClasses dataMobileClasses) {
        try {
            tvMobilePrice.setText(dataMobileClasses.getPrice().getValue().getDisplay());
            tvMobileTitle.setText(dataMobileClasses.getTitle());
            tvMobileTown.setText(dataMobileClasses.getLocationsResolved().getADMINLEVEL3Name());
            tvMobileCity.setText(dataMobileClasses.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgMobileCoverImage).load(dataMobileClasses.getImages().get(0).getUrl()).into(imgMobileCoverImage);
        }
        catch (Exception e)
        {
            tvExtraMobile.setText("");
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mobileClickListener.onClick(dataMobileClasses);
            }
        });
    }
}
