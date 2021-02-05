package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.rahul.olx.R;

public class PhoneDetails extends AppCompatActivity {

    private EditText etPhone;
    private Button btnNext;
    private ImageView ivBack;
    private static final String PHONE = "PHONE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_details);
        initViews();
    }

    private void initViews() {
        etPhone = findViewById(R.id.etEnterPhoneNumber);
        btnNext = findViewById(R.id.btnPhoneNumLogin);
        ivBack = findViewById(R.id.ivphoneDetailsBackArrow);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkPhoneNumber()) {
                    Intent intent = new Intent(PhoneDetails.this, confirmation_code.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneDetails.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private boolean checkPhoneNumber() {
        boolean condition = true;
        if (etPhone.getText().toString().length() != 10) {
            etPhone.setError("Phone number show be on 10 digits");
            condition = false;
        }
        return condition;
    }
}