package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rahul.olx.R;

public class Verify_your_phone extends AppCompatActivity {
    private EditText etNumber;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_your_phone);

        etNumber = findViewById(R.id.etEnterVrifyPhonePhoneNumber);
        btnNext = findViewById(R.id.btnPhoneNumLogin);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValid()) {
                    Intent intent = new Intent(Verify_your_phone.this, Edit_Profile.class);
                    intent.putExtra("number", etNumber.getText().toString());
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private boolean isValid()
    {
        boolean condition = true;
        if(etNumber.getText().toString().length() != 10)
        {
            etNumber.setError("Please enter a valid 10 digit number");
            condition = false;
        }
        return  condition;
    }
}