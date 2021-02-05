package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rahul.olx.R;

public class NamePageActivity extends AppCompatActivity {

    private EditText etName;
    private Button btnNext;
    private static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_page);
        initViews();
    }

    private void initViews() {
        btnNext = findViewById(R.id.btnNextPage);
        etName = findViewById(R.id.etUserName);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isValid())
                {
                   setPreference();
                   Intent intent = new Intent(NamePageActivity.this,maps_and_location.class);
                   startActivity(intent);
                   finish();
                }
                }
        });
    }

    private boolean isValid()
    {
        boolean condition = true;
        if(etName.getText().toString().isEmpty())
        {
            etName.setError("Please enter the name");
            condition = false;
        }
        return condition;
    }

    private void setPreference() {
        SavePreference.setStringToPre(NamePageActivity.this, NAME, etName.getText().toString());
    }
}