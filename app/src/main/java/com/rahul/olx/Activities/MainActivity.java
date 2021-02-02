package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.rahul.olx.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD:app/src/main/java/com/rahul/olx/MainActivity.java
        setContentView(R.layout.eneter_phone_details);

=======
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
>>>>>>> 20b3c64d2f4c0e63f973729959e675d0ef8e38ac:app/src/main/java/com/rahul/olx/Activities/MainActivity.java
    }
}