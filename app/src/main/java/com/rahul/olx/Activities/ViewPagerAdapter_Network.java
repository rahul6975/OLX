package com.rahul.olx.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter_Network extends FragmentStatePagerAdapter {
    public ViewPagerAdapter_Network(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentFollowing.newInstanse();
            case 1:
                return FragmentFollowers.newInstanse();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tabName = "";
        switch (position) {
            case 0:
                tabName = "FOLLOWING";
                break;
            case 1:
                tabName = "FOLLOWERS";
                break;
        }
        return tabName;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
