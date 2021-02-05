package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rahul.olx.R;

public class Edit_Profile extends AppCompatActivity {

    private TextView tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit__profile);

        tvPhone = findViewById(R.id.epPhone);

        tvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(this);
            }
        });
    }
}
