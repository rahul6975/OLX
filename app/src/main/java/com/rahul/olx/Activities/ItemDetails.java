package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.rahul.olx.R;

import es.dmoral.toasty.Toasty;

public class ItemDetails extends AppCompatActivity {
    private TextView tvPrice, tvTitle, tvExtras, tvTown, tvCity,
            tvBrand, tvBrandName, tvDescription, tvDetails, tvDescriptionList;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TextView btnChat, btnMakeOffer;
    private String price, title, extras, town, city, brand, brandName, description,
            image1, image2, image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        initViews();
        getIntents();
        setData();
        setViewPager();
    }

    private void setViewPager() {
        ImageViewPagerAdapter viewPagerAdapter = new ImageViewPagerAdapter(getSupportFragmentManager()
                , FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, image1, image2);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setData() {
        try {
            tvPrice.setText(price);
            tvTitle.setText(title);
            tvExtras.setText(extras);
            tvTown.setText(town);
            tvCity.setText(city);
            tvDescriptionList.setText(description);
        } catch (Exception e) {
            Toasty.normal(ItemDetails.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
        }

    }

    private void getIntents() {
        try {
            title = getIntent().getStringExtra("title");
            price = getIntent().getStringExtra("price");
            extras = getIntent().getStringExtra("extras");
            town = getIntent().getStringExtra("town");
            city = getIntent().getStringExtra("city");
            brand = getIntent().getStringExtra("brand");
            brandName = getIntent().getStringExtra("brandName");
            description = getIntent().getStringExtra("description");
            image1 = getIntent().getStringExtra("image1");
            image2 = getIntent().getStringExtra("image2");
        } catch (Exception e) {
            Toasty.normal(ItemDetails.this, e.getLocalizedMessage(), Toast.LENGTH_LONG).show();
        }
    }

    private void initViews() {
        tvPrice = findViewById(R.id.tvItemPrice);
        btnChat = findViewById(R.id.ChatBtnText);
        btnMakeOffer = findViewById(R.id.NavigationBtnText);
        tvTitle = findViewById(R.id.tvItemTitle);
        tvDetails = findViewById(R.id.tvDetails);
        tvExtras = findViewById(R.id.tvItemExtras);
        tvTown = findViewById(R.id.tvItemTown);
        tvCity = findViewById(R.id.tvItemCity);
        tvDescriptionList = findViewById(R.id.tvDescriptionList);
        tvDescription = findViewById(R.id.tvDescription);
        viewPager = findViewById(R.id.ViewPage);
        tabLayout = findViewById(R.id.tabLayout);

        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetails.this, MyNetworkSecondActivity.class);
                startActivity(intent);
            }
        });

        btnMakeOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItemDetails.this, MyNetworkSecondActivity.class);
                startActivity(intent);
            }
        });
    }
}