package com.rahul.olx.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentAll.newInstanse();
            case 1:
                return FragmentBuying.newInstanse();
            case 2:
                return FragmentSelling.newInstanse();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tabName = "";
        switch (position) {
            case 0:
                tabName = "ALL";
                break;
            case 1:
                tabName = "BUYING";
                break;
            case 2:
                tabName = "SELLING";
                break;
        }
        return tabName;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
