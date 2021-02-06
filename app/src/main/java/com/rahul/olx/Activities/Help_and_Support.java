package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rahul.olx.R;

public class Help_and_Support extends AppCompatActivity {

    private TextView tvHep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_and__support);
        tvHep = findViewById(R.id.TvVersion);

        tvHep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Help_and_Support.this,Team_Ivory.class);
                startActivity(intent);
            }
        });
    }
}