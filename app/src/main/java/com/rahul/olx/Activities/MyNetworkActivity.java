package com.rahul.olx.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.rahul.olx.R;

public class MyNetworkActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_network);
        viewPager = findViewById(R.id.viewPage);
        tabLayout = findViewById(R.id.TbTabLayout);
        setViewpgaerAdapter();
    }

    private void setViewpgaerAdapter() {
        ViewPagerAdapter_Network viewPagerAdapter_network = new ViewPagerAdapter_Network(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter_network);
        tabLayout.setupWithViewPager(viewPager);
    }
}