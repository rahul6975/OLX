package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rahul.olx.R;

public class PhoneDetails extends AppCompatActivity {

    private EditText etPhone;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_details);
        initViews();
    }

    private void initViews() {
        etPhone = findViewById(R.id.etEnterPhoneNumber);
        btnNext = findViewById(R.id.btnPhoneNumLogin);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkPhoneNumber())
                {
                    Intent intent = new Intent(PhoneDetails.this,confirmation_code.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }

    private boolean checkPhoneNumber()
    {
        boolean condition = true;
        if(etPhone.getText().toString().length()!= 10)
        {
            etPhone.setError("Phone number show be on 10 digits");
            condition =false;
        }
        return  condition;
    }
}