package com.rahul.olx.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.rahul.olx.R;

import es.dmoral.toasty.Toasty;

public class Settings extends AppCompatActivity {

    private TextView tvPrivacy, tvLogout, tvLogfromAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        init();
    }

    private void init() {
        tvPrivacy = findViewById(R.id.TvPrivacy);
        tvLogout = findViewById(R.id.TvLogout);
        tvLogfromAll = findViewById(R.id.TvLogoutFromAll);
        tvPrivacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Settings.this, Password.class);
                startActivity(intent);
            }
        });

        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Settings.this);
                alertDialog.setTitle("Logout")
                        .setMessage("Do you want to Logout ?")
                        .setCancelable(true)
                        .setPositiveButton("Log Out", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toasty.info(Settings.this, " Dont show again ", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Settings.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .show();


            }
        });
        tvLogfromAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(Settings.this);
                alertDialog.setTitle("Logout")
                        .setMessage("Do you want to Logout from all devices ?")
                        .setCancelable(true)
                        .setPositiveButton("Log Out", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toasty.info(Settings.this, " Dont show again ", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Settings.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .show();
            }
        });

    }
}