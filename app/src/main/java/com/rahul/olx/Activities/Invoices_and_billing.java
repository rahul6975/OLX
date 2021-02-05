package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rahul.olx.R;

public class Invoices_and_billing extends AppCompatActivity {

    private TextView tvBuyPack, tvOrders, tvInvoices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoices_and_billing);
        initViews();
    }

    private void initViews() {
        tvBuyPack = findViewById(R.id.TvBuyPacks);
        tvOrders = findViewById(R.id.TvMyOrders);
        tvInvoices = findViewById(R.id.TvInvoices);

        tvBuyPack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Invoices_and_billing.this,Buy_packages.class);
                startActivity(intent);
            }
        });

        tvOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Invoices_and_billing.this,MyOrdersActivity.class);
                startActivity(intent);
            }
        });

        tvInvoices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Invoices_and_billing.this,Invoices.class);
                startActivity(intent);
            }
        });
    }
}