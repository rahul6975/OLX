package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.BangaloreResponseClasses.DataBangaloreClasses;
import com.rahul.olx.ClickListeners.BangaloreClickListener;
import com.rahul.olx.MumbaiResponseClasses.DataMumbaiClasses;
import com.rahul.olx.R;

public class BangaloreViewHolder extends RecyclerView.ViewHolder {
    private BangaloreClickListener bangaloreClickListener;
    private ConstraintLayout constraintLayout;
    private TextView tvBangalorePrice, tvBangaloreTitle, tvBangaloreTown, tvBangaloreCity ,tvExtraBangalore;
    private ImageView imgBangaloreCoverImage, imgBangaloreHeart;
    public BangaloreViewHolder(@NonNull View itemView, BangaloreClickListener bangaloreClickListener) {
        super(itemView);
        this.bangaloreClickListener = bangaloreClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        tvBangalorePrice = itemView.findViewById(R.id.PriceOfMumbai);
        constraintLayout = itemView.findViewById(R.id.constraintLayout2);
        tvBangaloreTitle = itemView.findViewById(R.id.TitleOfMumbai);
        tvExtraBangalore = itemView.findViewById(R.id.ExtrasOfMumbai);
        tvBangaloreTown = itemView.findViewById(R.id.tvTownOfMumbai);
        tvBangaloreCity = itemView.findViewById(R.id.CityOfMumbai);
        imgBangaloreCoverImage = itemView.findViewById(R.id.imgInMumbai);
        imgBangaloreHeart = itemView.findViewById(R.id.imgMumbaiHeart);
        imgBangaloreHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgBangaloreHeart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }

    public void setData(DataBangaloreClasses dataBangaloreClasses) {
        try {
            tvBangalorePrice.setText(dataBangaloreClasses.getPrice().getValue().getDisplay());
            tvBangaloreTitle.setText(dataBangaloreClasses.getTitle());
            tvExtraBangalore.setText(dataBangaloreClasses.getMainInfo());
            tvBangaloreTown.setText(dataBangaloreClasses.getLocationsResolved().getADMINLEVEL3Name());
            tvBangaloreCity.setText(dataBangaloreClasses.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgBangaloreCoverImage).load(dataBangaloreClasses.getImages().get(0).getUrl()).into(imgBangaloreCoverImage);
        }
        catch (Exception e)
        {
            tvExtraBangalore.setText("");
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bangaloreClickListener.onClick(dataBangaloreClasses);
            }
        });
    }


}
