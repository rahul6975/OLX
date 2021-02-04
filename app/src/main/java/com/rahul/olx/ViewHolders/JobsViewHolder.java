package com.rahul.olx.ViewHolders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.rahul.olx.CarResponseClasses.DataCarClasses;
import com.rahul.olx.ClickListeners.JobClickListener;
import com.rahul.olx.JobsReponseClasses.DataJobClasses;
import com.rahul.olx.R;

public class JobsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvJobPrice, tvJobTitle, tvJobTown, tvJobCity ,tvExtraJob;
    private JobClickListener jobClickListener;
    private ConstraintLayout constraintLayout;
    private ImageView imgJobCoverImage, imgJobheart;

    public JobsViewHolder(@NonNull View itemView, JobClickListener jobClickListener) {
        super(itemView);
        this.jobClickListener = jobClickListener;
        initView(itemView);
    }
    private void initView(View itemView) {
        tvJobPrice = itemView.findViewById(R.id.PriceOfBrowseCategory);
        tvJobTitle = itemView.findViewById(R.id.TitleOfBrowseCategory);
        constraintLayout = itemView.findViewById(R.id.constraintLayout);
        tvExtraJob = itemView.findViewById(R.id.ExtrasOfBrowseCategory);
        tvJobTown = itemView.findViewById(R.id.tvTownOfBrowseCategory);
        tvJobCity = itemView.findViewById(R.id.CityOfBrowseCategory);
        imgJobCoverImage = itemView.findViewById(R.id.imgInBrowseCategory);
        imgJobheart = itemView.findViewById(R.id.imgBrowseCategoryHeart);
        imgJobheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgJobheart.setImageResource(R.drawable.ic_heart_selected);
            }
        });
    }
    public void setData(DataJobClasses dataJobClasses) {
        try {
            tvJobPrice.setTextSize(R.dimen.sp_15);
            tvJobPrice.setText(dataJobClasses.getMainInfo());
            tvJobTitle.setText(dataJobClasses.getTitle());
            tvJobTown.setText(dataJobClasses.getLocationsResolved().getADMINLEVEL3Name());
            tvJobCity.setText(dataJobClasses.getLocationsResolved().getADMINLEVEL1Name());
            Glide.with(imgJobCoverImage).load(dataJobClasses.getImages().get(0).getUrl()).into(imgJobCoverImage);
        }
        catch (Exception e)
        {
            tvExtraJob.setText("");
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jobClickListener.onClick(dataJobClasses);
            }
        });
    }

}
