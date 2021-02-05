package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rahul.olx.R;

public class EditProfileActivity extends AppCompatActivity {
    private Button btnEdit;
    private TextView tvName, tvFollowing, tvFollower;
    private static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        btnEdit = findViewById(R.id.btnEditProfile);
        tvFollowing = findViewById(R.id.TvFollowing);
        tvFollower = findViewById(R.id.TvFollowers);
        tvName = findViewById(R.id.TvDhanashree_rane);
        tvName.setText(SavePreference.getStringFromPre(this,NAME));
        btnEdit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(EditProfileActivity.this, Edit_Profile.class);
                 startActivity(intent);
                 finish();
             }
         });

        tvFollowing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditProfileActivity.this, MyNetworkActivity.class);
                startActivity(intent);
            }
        });

        tvFollower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditProfileActivity.this, MyNetworkActivity.class);
                startActivity(intent);
            }
        });
    }
}