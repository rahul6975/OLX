package com.rahul.olx.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapterMyOrders extends FragmentStatePagerAdapter {

    public ViewPagerAdapterMyOrders(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentActive.newInstance();
            case 1:
                return FragmentScheduled.newInstance();
            case 2:
                return FragmentExpired.newInstance();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tabName = "";
        switch (position) {
            case 0:
                tabName = "ACTIVE";
                break;
            case 1:
                tabName = "SCHEDULED";
                break;
            case 2:
                tabName = "EXPIRED";
                break;
        }
        return tabName;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
