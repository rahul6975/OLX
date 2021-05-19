package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.rahul.olx.R;

import es.dmoral.toasty.Toasty;

public class PhoneDetails_AccessoriesActivity extends AppCompatActivity {

    private EditText etTitle, etSelling;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_details__accessories);
        init();
    }

    private void init() {
        etTitle = findViewById(R.id.EtAddTitle_accesories);
        btnNext = findViewById(R.id.btnNext_accessories);
        etSelling = findViewById(R.id.EtWhatYouSelling_accessories);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid()) {
                    Toasty.error(PhoneDetails_AccessoriesActivity.this, "Application received, you'll receive a confirmation call",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(PhoneDetails_AccessoriesActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private boolean isValid() {
        boolean condition = true;
        if (etTitle.getText().toString().isEmpty()) {
            etTitle.setError("Please enter the title");
            condition = false;
        }
        if (etSelling.getText().toString().isEmpty()) {
            etSelling.setError("Please describe your application");
            condition = false;
        }
        return condition;
    }
}