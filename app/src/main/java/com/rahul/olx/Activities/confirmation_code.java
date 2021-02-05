package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rahul.olx.R;

public class confirmation_code extends AppCompatActivity {
    private EditText etCode1, etCode2, etCode3, etCode4;
    private Button btncontinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_code);
        initViews();
    }

    private void initViews() {
        etCode1 = findViewById(R.id.etCode_1);
        etCode2 = findViewById(R.id.etCode_2);
        etCode3 = findViewById(R.id.etCode_3);
        etCode4 = findViewById(R.id.etCode_4);
        btncontinue = findViewById(R.id.btnContinuePhone);

        etCode1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etCode1.setText("4");
            }
        });
        etCode2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etCode2.setText("7");
            }
        });
        etCode3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etCode3.setText("2");
            }
        });
        etCode4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etCode4.setText("9");
                btncontinue.setVisibility(View.VISIBLE);
            }
        });

        btncontinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(confirmation_code.this, NamePageActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}