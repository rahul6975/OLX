package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.rahul.olx.Fragments.AccountFragment;
import com.rahul.olx.R;

import es.dmoral.toasty.Toasty;

public class Edit_Profile extends AppCompatActivity {

    private TextView tvPhone, tvEmail;
    private TextView tvSave, tvProfileName;
    private static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__profile);
        tvSave = findViewById(R.id.tvEditProfileHeader);
        tvPhone = findViewById(R.id.epPhone);
        tvEmail = findViewById(R.id.tvEmail);
        tvProfileName = findViewById(R.id.EditProfileName);

        tvProfileName.setText(SavePreference.getStringFromPre(this, NAME));


        if (getIntent() != null) {
            tvEmail.setText(getIntent().getStringExtra("email"));
            tvPhone.setText(getIntent().getStringExtra("number"));
        }

        tvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Edit_Profile.this, Verify_your_phone.class);
                startActivity(intent);
                finish();
            }
        });

        tvEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Edit_Profile.this, Enter_your_email.class);
                startActivity(intent);
                finish();
            }
        });

        tvSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.info(Edit_Profile.this, "Details saved successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Edit_Profile.this,MainActivity.class);
                startActivity(intent);
//                AccountFragment accountFragment = new AccountFragment();
//                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,accountFragment,"account").commit();
            }
        });

    }

}
