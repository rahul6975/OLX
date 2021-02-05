package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.rahul.olx.R;

public class my_offers_menu extends AppCompatActivity {

    private ImageView ivBack;
    private LinearLayout llCars, llProperties, llMobiles, llJobs, llBikes, llElectronics,
            llVehicals, llMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_offers_menu);
        init();
    }

    private void init() {
        ivBack = findViewById(R.id.ivMyOrdersCross);
        llCars = findViewById(R.id.LLCars);
        llProperties = findViewById(R.id.LLProperties);
        llMobiles = findViewById(R.id.LLMobiles);
        llJobs = findViewById(R.id.LLJobs);
        llBikes = findViewById(R.id.LLBikes);
        llElectronics = findViewById(R.id.LLElectronics);
        llVehicals = findViewById(R.id.LLVehicals);
        llMore = findViewById(R.id.LLMore);


        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_offers_menu.this,Homepage.class);
                startActivity(intent);
                finish();
            }
        });
        llCars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_offers_menu.this,ProductDetailsActivity.class);
                startActivity(intent);
            }
        });

        llProperties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_offers_menu.this,ProductDetailsActivity.class);
                startActivity(intent);
            }
        });

        llMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_offers_menu.this,ProductDetailsActivity.class);
                startActivity(intent);
            }
        });
        llMobiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_offers_menu.this,MobileDetailesActivity.class);
                startActivity(intent);
            }
        });
        llJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_offers_menu.this,ProductDetailsActivity.class);
                startActivity(intent);
            }
        });
        llBikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_offers_menu.this,ProductDetailsActivity.class);
                startActivity(intent);
            }
        });

        llElectronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_offers_menu.this,ProductDetailsActivity.class);
                startActivity(intent);
            }
        });

        llVehicals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_offers_menu.this,CommercialVehiclesSparesActivity.class);
                startActivity(intent);
            }
        });
    }
}