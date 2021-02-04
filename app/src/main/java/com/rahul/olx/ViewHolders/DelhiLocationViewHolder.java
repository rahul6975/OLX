package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.ClickListeners.DelhiClickListener;
import com.rahul.olx.DelhiResponseClasses.DataDelhiClasses;
import com.rahul.olx.MumbaiResponseClasses.DataMumbaiClasses;
import com.rahul.olx.R;

public class DelhiLocationViewHolder extends RecyclerView.ViewHolder {
    private DelhiClickListener delhiClickListener;
    private ConstraintLayout constraintLayout;
    private TextView tvDelhiPrice, tvDelhiTitle, tvDelhiTown, tvDelhiCity ,tvExtraDelhi;
    private ImageView imgDelhiCoverImage, imgDelhiheart;
    public DelhiLocationViewHolder(@NonNull View itemView, DelhiClickListener delhiClickListener) {
        super(itemView);
        this.delhiClickListener = delhiClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        tvDelhiPrice = itemView.findViewById(R.id.PriceOfMumbai);
        constraintLayout = itemView.findViewById(R.id.constraintLayout2);
        tvDelhiTitle = itemView.findViewById(R.id.TitleOfMumbai);
        tvExtraDelhi = itemView.findViewById(R.id.ExtrasOfMumbai);
        tvDelhiTown = itemView.findViewById(R.id.tvTownOfMumbai);
        tvDelhiCity = itemView.findViewById(R.id.CityOfMumbai);
        imgDelhiCoverImage = itemView.findViewById(R.id.imgInMumbai);
        imgDelhiheart = itemView.findViewById(R.id.imgMumbaiHeart);
        imgDelhiheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgDelhiheart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }

    public void setData(DataDelhiClasses dataDelhiClasses) {
        try {
            tvDelhiPrice.setText(dataDelhiClasses.getPrice().getValue().getDisplay());
            tvDelhiTitle.setText(dataDelhiClasses.getTitle());
            tvExtraDelhi.setText(dataDelhiClasses.getMainInfo());
            tvDelhiTown.setText(dataDelhiClasses.getLocationsResolved().getADMINLEVEL3Name());
            tvDelhiCity.setText(dataDelhiClasses.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgDelhiCoverImage).load(dataDelhiClasses.getImages().get(0).getUrl()).into(imgDelhiCoverImage);
        }
        catch (Exception e)
        {
            tvExtraDelhi.setText("");
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delhiClickListener.onClick(dataDelhiClasses);
            }
        });
    }
}
