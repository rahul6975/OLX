package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.BikesResponseClasses.DataClass;
import com.rahul.olx.R;

public class BikeViewHolder extends RecyclerView.ViewHolder {

    private TextView tvPrice, tvTitle, tvTown, tvCity;
    private ImageView imgCoverImage, imgheart;

    public BikeViewHolder(@NonNull View itemView) {
        super(itemView);
        init(itemView);
    }

    private void init(View itemView) {
        tvPrice = itemView.findViewById(R.id.tvPrice);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvTown = itemView.findViewById(R.id.tvTown);
        tvCity = itemView.findViewById(R.id.tvCity);
        imgCoverImage = itemView.findViewById(R.id.ImgCoverPhoto);
        imgheart = itemView.findViewById(R.id.ivHeart);
        imgheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgheart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }
    public void setData(DataClass dataClass)
    {
        tvPrice.setText(dataClass.getPrice().getValue().getDisplay());
        tvTitle.setText(dataClass.getTitle());
        tvTown.setText(dataClass.getLocationsResolved().getADMINLEVEL3Name());
        tvCity.setText(dataClass.getLocationsResolved().getADMINLEVEL1Name());
        Glide.with(imgCoverImage).load(dataClass.getImages().get(0).getUrl()).into(imgCoverImage);
    }
}
