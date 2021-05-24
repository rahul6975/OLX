package com.rahul.olx.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.rahul.olx.R;

import es.dmoral.toasty.Toasty;

public class LoginActivity extends AppCompatActivity {
    private Button btnWithPhone, btnContinueWithGoogle;
    private static final int REQ_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
    }

    private void initViews() {
        btnWithPhone = findViewById(R.id.btnContinueWithPhone);
        btnContinueWithGoogle = findViewById(R.id.btnContinueWithGoogle);
        btnContinueWithGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, Google_Login.class);
                startActivity(intent);
                finish();
            }
        });
        btnWithPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCompat.requestPermissions(LoginActivity.this, new String[]{Manifest.permission.READ_CONTACTS}, REQ_CODE);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case REQ_CODE:
                if (grantResults.length >= 1) {
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        Intent intent = new Intent(LoginActivity.this, PhoneDetails.class);
                        startActivity(intent);
                        finish();
                    } else if (ActivityCompat.shouldShowRequestPermissionRationale(LoginActivity.this, permissions[0])) {
                        Toasty.info(LoginActivity.this, "Please grant contact permissions for further actions", Toast.LENGTH_SHORT).show();
                    } else {
                        Toasty.info(LoginActivity.this, "Please grant contact permissions for further actions", Toast.LENGTH_SHORT).show();

                    }

                }

        }
    }
}
