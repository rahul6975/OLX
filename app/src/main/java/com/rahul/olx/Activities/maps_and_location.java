package com.rahul.olx.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.rahul.olx.R;

import es.dmoral.toasty.Toasty;

public class maps_and_location extends AppCompatActivity {

    private RelativeLayout rl;
    private static final int REQ_CODE = 1;
    private TextView tvLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_and_location);
        initViews();
    }

    private void initViews() {
        rl = findViewById(R.id.RelativeLayout);
        tvLink = findViewById(R.id.tvLink);
        tvLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(maps_and_location.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCompat.requestPermissions(maps_and_location.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQ_CODE);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQ_CODE:
                if (grantResults.length >= 1) {
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        Intent intent = new Intent(maps_and_location.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    } else if (ActivityCompat.shouldShowRequestPermissionRationale(maps_and_location.this, permissions[0])) {
                        Toasty.info(maps_and_location.this, "Please grant contact permissions for further actions", Toast.LENGTH_SHORT).show();
                    } else {
                        Toasty.info(maps_and_location.this, "Please grant contact permissions for further actions", Toast.LENGTH_SHORT).show();

                    }

                }

        }
    }
}