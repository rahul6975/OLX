package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.rahul.olx.R;

public class ChatActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ImageView ivHome, ivChat, ivSell, ivHeart, ivAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        viewPager = findViewById(R.id.viewPage);
        tabLayout = findViewById(R.id.TbTabLayout);
        ivHome = findViewById(R.id.ibRefresh);
        ivChat = findViewById(R.id.ibLocation);
        ivSell = findViewById(R.id.ibHeart);
        ivHeart = findViewById(R.id.ibChat);
        ivAccount = findViewById(R.id.ibUser);
        setViewpgaerAdapter();
    }

    private void setViewpgaerAdapter() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        ivHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, Homepage.class);
                startActivity(intent);
                finish();
            }
        });

        ivChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, ChatActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ivSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, my_offers_menu.class);
                startActivity(intent);
                finish();
            }
        });

        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, MyAdsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ivAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChatActivity.this, AccountPageActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}