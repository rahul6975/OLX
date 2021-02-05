package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rahul.olx.R;

public class Buy_packages extends AppCompatActivity {
    private TextView tvCategories, tvLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_packages);
        init();
    }

    private void init() {
        tvCategories = findViewById(R.id.tvCategories);
        tvLocation = findViewById(R.id.tvLocation);

        tvCategories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buy_packages.this,Categories.class);
                startActivity(intent);
            }
        });

        tvLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Buy_packages.this,LocationActivity.class);
                startActivity(intent);
            }
        });
    }
}