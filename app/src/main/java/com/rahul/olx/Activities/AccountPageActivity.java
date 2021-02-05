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
    private TextView tvName, tvEdit;
    private static String NAME = "name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_page);
        ivHome = findViewById(R.id.ibRefresh);
        ivChat = findViewById(R.id.ibLocation);
        ivSell = findViewById(R.id.ibHeart);
        ivHeart = findViewById(R.id.ibChat);
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

    }
}