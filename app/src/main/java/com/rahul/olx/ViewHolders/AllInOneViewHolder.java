package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.AllInOneResponseClasses.DataClasses;
import com.rahul.olx.ClickListeners.AllInOneClickListener;
import com.rahul.olx.R;

public class AllInOneViewHolder extends RecyclerView.ViewHolder {
    private TextView tvAllPrice, tvAllTitle, tvAllTown, tvAllCity;
    private ImageView imgAllCoverImage, imgAllheart;
    private CardView cardView;
    private AllInOneClickListener allInOneClickListener;

    public AllInOneViewHolder(@NonNull View itemView , AllInOneClickListener allInOneClickListener ) {
        super(itemView);
        this.allInOneClickListener = allInOneClickListener;
        initViewsAndListeners(itemView);
    }

    private void initViewsAndListeners(View itemView) {
        tvAllPrice = itemView.findViewById(R.id.tvAllPrice);
        tvAllTitle = itemView.findViewById(R.id.tvAllTitle);
        cardView = itemView.findViewById(R.id.CardView);
        tvAllTown = itemView.findViewById(R.id.tvAllTown);
        tvAllCity = itemView.findViewById(R.id.tvAllCity);
        imgAllCoverImage = itemView.findViewById(R.id.ImgAllCoverPhoto);
        imgAllheart = itemView.findViewById(R.id.ivAllHeart);
        imgAllheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgAllheart.setImageResource(R.drawable.ic_heart_selected);
            }
        });

        imgAllheart.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imgAllheart.setImageResource(R.drawable.ic_heart_unselected);
                return false;
            }
        });
    }

    public void setData(DataClasses dataClasses) {
        try {
            tvAllPrice.setText(dataClasses.getPrice().getValue().getDisplay());
            tvAllTitle.setText(dataClasses.getTitle());
            tvAllTown.setText(dataClasses.getLocationsResolved().getADMINLEVEL3Name());
            tvAllCity.setText(dataClasses.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgAllCoverImage).load(dataClasses.getImages().get(0).getUrl()).into(imgAllCoverImage);
        } catch (Exception e) {
            tvAllPrice.setText(R.string.price_not_mentioned);
        }
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                if(position != RecyclerView.NO_POSITION)
                {
                    allInOneClickListener.onItemClick(dataClasses);
                }
            }
        });
    }
}
