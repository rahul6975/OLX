package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rahul.olx.R;

public class CommercialVehiclesSparesActivity extends AppCompatActivity {

    private TextView tvCoomm, tvSpare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial_vehicles_spares);
        initViews();
    }

    private void initViews() {
        tvCoomm = findViewById(R.id.TvCommercialOther_commercial);
        tvSpare = findViewById(R.id.TvSpareParts_commercial);

        tvCoomm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommercialVehiclesSparesActivity.this, ProductDetailsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        tvSpare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommercialVehiclesSparesActivity.this, ProductDetailsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}