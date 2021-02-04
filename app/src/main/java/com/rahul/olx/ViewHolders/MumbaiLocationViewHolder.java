package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.BikesResponseClasses.DataClass;
import com.rahul.olx.ClickListeners.MumbaiClickListener;
import com.rahul.olx.MumbaiResponseClasses.DataMumbaiClasses;
import com.rahul.olx.R;

public class MumbaiLocationViewHolder extends RecyclerView.ViewHolder {

    private TextView tvMumbaiPrice, tvMumbaiTitle, tvMumbaiTown, tvMumbaiCity ,tvExtraMumbai;
    private ImageView imgMumbaiCoverImage, imgMumbaiheart;
    private MumbaiClickListener mumbaiClickListener;
    private ConstraintLayout constraintLayout;

    public MumbaiLocationViewHolder(@NonNull View itemView, MumbaiClickListener mumbaiClickListener) {
        super(itemView);
        this.mumbaiClickListener = mumbaiClickListener;
        initView(itemView);

    }

    private void initView(View itemView) {
        tvMumbaiPrice = itemView.findViewById(R.id.PriceOfMumbai);
        constraintLayout = itemView.findViewById(R.id.constraintLayout2);
        tvMumbaiTitle = itemView.findViewById(R.id.TitleOfMumbai);
        tvExtraMumbai = itemView.findViewById(R.id.ExtrasOfMumbai);
        tvMumbaiTown = itemView.findViewById(R.id.tvTownOfMumbai);
        tvMumbaiCity = itemView.findViewById(R.id.CityOfMumbai);
        imgMumbaiCoverImage = itemView.findViewById(R.id.imgInMumbai);
        imgMumbaiheart = itemView.findViewById(R.id.imgMumbaiHeart);
        imgMumbaiheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgMumbaiheart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }

    public void setData(DataMumbaiClasses dataMumbaiClasses) {
        try {
            tvMumbaiPrice.setText(dataMumbaiClasses.getPrice().getValue().getDisplay());
            tvMumbaiTitle.setText(dataMumbaiClasses.getTitle());
            tvExtraMumbai.setText(dataMumbaiClasses.getMainInfo());
            tvMumbaiTown.setText(dataMumbaiClasses.getLocationsResolved().getADMINLEVEL3Name());
            tvMumbaiCity.setText(dataMumbaiClasses.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgMumbaiCoverImage).load(dataMumbaiClasses.getImages().get(0).getUrl()).into(imgMumbaiCoverImage);
        }
        catch (Exception e)
        {
                tvExtraMumbai.setText("");
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mumbaiClickListener.onClick(dataMumbaiClasses);
            }
        });
    }
}
