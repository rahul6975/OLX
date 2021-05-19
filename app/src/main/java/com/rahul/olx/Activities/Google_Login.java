package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.rahul.olx.R;

public class Google_Login extends AppCompatActivity {
    private EditText etEmail;
    private Button btnGoogleLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google__login);
        initViews();
    }

    private void initViews() {
        etEmail = findViewById(R.id.etEmail);
        btnGoogleLogin = findViewById(R.id.btnGoogleLogin);
        btnGoogleLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (emailValidate()) {
                    Intent intent = new Intent(Google_Login.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private boolean emailValidate() {
        boolean email = true;
        if (!etEmail.getText().toString().contains("@gmail.com")) {
            etEmail.setError("please enter a valid google e-mail id");
            email = false;
        }
        return email;
    }
}