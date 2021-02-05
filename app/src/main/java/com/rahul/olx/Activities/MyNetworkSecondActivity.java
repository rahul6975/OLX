package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.rahul.olx.R;

public class MyNetworkSecondActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_network_second);
        viewPager = findViewById(R.id.viewPage);
        tabLayout = findViewById(R.id.TbTabLayout);
        setViewpagaerAdapter();
    }

    private void setViewpagaerAdapter() {
        ViewPagerAdapter_chat viewPagerAdapter_chat = new ViewPagerAdapter_chat(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter_chat);
        tabLayout.setupWithViewPager(viewPager);
    }

}