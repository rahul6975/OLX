package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.ClickListeners.KolkataClickListener;
import com.rahul.olx.KolKataResponseClasses.DataKolkataClasses;
import com.rahul.olx.MumbaiResponseClasses.DataMumbaiClasses;
import com.rahul.olx.R;

public class KolkataViewHolder extends RecyclerView.ViewHolder {

    private TextView tvKolkataPrice, tvKolkataTitle, tvKolkataTown, tvKolkataCity ,tvExtraKolkata;
    private KolkataClickListener kolkataClickListener;
    private ConstraintLayout constraintLayout;
    private ImageView imgKolkataCoverImage, imgKolkataheart;

    public KolkataViewHolder(@NonNull View itemView, KolkataClickListener kolkataClickListener) {
        super(itemView);
        this.kolkataClickListener = kolkataClickListener;
        itemView(itemView);
    }

    private void itemView(View itemView) {
        tvKolkataPrice = itemView.findViewById(R.id.PriceOfMumbai);
        constraintLayout = itemView.findViewById(R.id.constraintLayout2);
        tvKolkataTitle = itemView.findViewById(R.id.TitleOfMumbai);
        tvExtraKolkata = itemView.findViewById(R.id.ExtrasOfMumbai);
        tvKolkataTown = itemView.findViewById(R.id.tvTownOfMumbai);
        tvKolkataCity = itemView.findViewById(R.id.CityOfMumbai);
        imgKolkataCoverImage = itemView.findViewById(R.id.imgInMumbai);
        imgKolkataheart = itemView.findViewById(R.id.imgMumbaiHeart);
        imgKolkataheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgKolkataheart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }

    public void setData(DataKolkataClasses dataKolkataClasses) {
        try {
            tvKolkataPrice.setText(dataKolkataClasses.getPrice().getValue().getDisplay());
            tvKolkataTitle.setText(dataKolkataClasses.getTitle());
            tvExtraKolkata.setText(dataKolkataClasses.getMainInfo());
            tvKolkataTown.setText(dataKolkataClasses.getLocationsResolved().getADMINLEVEL3Name());
            tvKolkataCity.setText(dataKolkataClasses.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgKolkataCoverImage).load(dataKolkataClasses.getImages().get(0).getUrl()).into(imgKolkataCoverImage);
        }
        catch (Exception e)
        {
            tvExtraKolkata.setText("");
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kolkataClickListener.onClick(dataKolkataClasses);
            }
        });
    }
    }



