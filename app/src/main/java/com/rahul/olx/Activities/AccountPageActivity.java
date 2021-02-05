package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahul.olx.R;

public class AccountPageActivity extends AppCompatActivity {
    private ImageView ivHome, ivChat, ivSell, ivHeart, ivAccount;
    private TextView tvName, tvEdit, tvBuyPackages, tvSettings, tvHelp;
    private static String NAME = "name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_page);
        ivHome = findViewById(R.id.ibRefresh);
        ivChat = findViewById(R.id.ibLocation);
        ivSell = findViewById(R.id.ibHeart);
        tvBuyPackages = findViewById(R.id.TvBuyPackages);
        tvHelp = findViewById(R.id.TvHelpAndSupport);
        ivHeart = findViewById(R.id.ibChat);
        tvSettings = findViewById(R.id.TvSettings);
        tvEdit = findViewById(R.id.TvViewAndEdit);
        ivAccount = findViewById(R.id.ibUser);
        tvName =findViewById(R.id.TvSettingsProfileName);

        tvName.setText(SavePreference.getStringFromPre(this,NAME));

        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountPageActivity.this,Homepage.class);
                startActivity(intent);
                finish();
            }
        });

        ivChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountPageActivity.this,ChatActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ivSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountPageActivity.this,my_offers_menu.class);
                startActivity(intent);
                finish();
            }
        });

        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountPageActivity.this,MyAdsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        tvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountPageActivity.this,EditProfileActivity.class);
                startActivity(intent);
            }
        });

        tvBuyPackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountPageActivity.this,Invoices_and_billing.class);
                startActivity(intent);
            }
        });

        tvSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountPageActivity.this,Settings.class);
                startActivity(intent);
            }
        });

        tvHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountPageActivity.this,Help_and_Support.class);
                startActivity(intent);
            }
        });

    }
}