package com.rahul.olx.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.rahul.olx.Activities.CommercialVehiclesSparesActivity;
import com.rahul.olx.Activities.MainActivity;
import com.rahul.olx.Activities.MobileDetailesActivity;
import com.rahul.olx.Activities.ProductDetailsActivity;
import com.rahul.olx.R;

public class CategoriesFragment extends Fragment {

    private ImageView ivBack;
    private LinearLayout llCars, llProperties, llMobiles, llJobs, llBikes, llElectronics,
            llVehicals, llMore;


    public CategoriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        ivBack = view.findViewById(R.id.ivMyOrdersCross);
        llCars = view.findViewById(R.id.LLCars);
        llProperties = view.findViewById(R.id.LLProperties);
        llMobiles = view.findViewById(R.id.LLMobiles);
        llJobs = view.findViewById(R.id.LLJobs);
        llBikes = view.findViewById(R.id.LLBikes);
        llElectronics = view.findViewById(R.id.LLElectronics);
        llVehicals = view.findViewById(R.id.LLVehicals);
        llMore = view.findViewById(R.id.LLMore);


        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);

            }
        });
        llCars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProductDetailsActivity.class);
                startActivity(intent);
            }
        });

        llProperties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ProductDetailsActivity.class);
                startActivity(intent);
            }
        });

        llMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ProductDetailsActivity.class);
                startActivity(intent);
            }
        });
        llMobiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MobileDetailesActivity.class);
                startActivity(intent);
            }
        });
        llJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ProductDetailsActivity.class);
                startActivity(intent);
            }
        });
        llBikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ProductDetailsActivity.class);
                startActivity(intent);
            }
        });

        llElectronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ProductDetailsActivity.class);
                startActivity(intent);
            }
        });

        llVehicals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CommercialVehiclesSparesActivity.class);
                startActivity(intent);
            }
        });
    }
}