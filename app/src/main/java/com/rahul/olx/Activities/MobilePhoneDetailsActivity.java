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

public class MobilePhoneDetailsActivity extends AppCompatActivity {

    private Button btnNext;
    private EditText etBrand, etTitle, etSelling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_phone_details);
        initViewS();
    }

    private void initViewS() {
        btnNext = findViewById(R.id.btnNext_Mobile);
        etBrand = findViewById(R.id.EtBrand_Mobile);
        etTitle = findViewById(R.id.EtAddTitle_Mobile);
        etSelling = findViewById(R.id.EtWhatYouSelling_mobile);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValid()) {
                    Toasty.info(MobilePhoneDetailsActivity.this, "Application received, you'll receive a confirmation call",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MobilePhoneDetailsActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });


    }

    private boolean isValid() {
        boolean condition = true;
        if (etBrand.getText().toString().isEmpty()) {
            etBrand.setError("Please enter the brand name");
            condition = false;
        }
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