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

public class Enter_your_email extends AppCompatActivity {

    private Button btnNext;
    private EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_your_email);

        etEmail = findViewById(R.id.etEnterEmail);
        btnNext = findViewById(R.id.enterMailbtn);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.info(Enter_your_email.this,"Email verified successfully",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Enter_your_email.this,Edit_Profile.class);
                intent.putExtra("email",etEmail.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }

    private boolean isValid()
    {
        boolean condition = true;
        String email = etEmail.getText().toString();
        if(!email.contains("@gmail.com"))
        {
            etEmail.setError("Enter a valid email address");
        }
        return condition;
    }
}