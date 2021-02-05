package com.rahul.olx.Activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter_chat extends FragmentStatePagerAdapter {
    public ViewPagerAdapter_chat(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentChat.newInstanse();
            case 1:
                return FragmentMakeOver.newInstanse();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tabName = "";
        switch (position) {
            case 0:
                tabName = "CHAT";
                break;
            case 1:
                tabName = "MAKE OFFER";
                break;
        }
        return tabName;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
