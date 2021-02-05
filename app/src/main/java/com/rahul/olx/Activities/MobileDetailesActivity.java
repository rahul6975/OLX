package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rahul.olx.R;

public class MobileDetailesActivity extends AppCompatActivity {

    private TextView tvMobile, tvMobileAsses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_detailes);
        iniViews();
    }

    private void iniViews() {

        tvMobile  = findViewById(R.id.TvMobilePhones);
        tvMobileAsses  = findViewById(R.id.TvAccessories);

        tvMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MobileDetailesActivity.this, MobilePhoneDetailsActivity.class);
                startActivity(intent);
            }
        });

        tvMobileAsses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MobileDetailesActivity.this, PhoneDetails_AccessoriesActivity.class);
                startActivity(intent);
            }
        });
    }
}