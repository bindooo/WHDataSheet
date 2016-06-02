package com.faveoffate.whdatasheet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class LoadFragmentPageAdapter extends FragmentPagerAdapter {

    private int mNumOfTabs;

    public LoadFragmentPageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                LoadStatsFragment tab1 = new LoadStatsFragment();
                return tab1;
            case 1:
                LoadSkillsFragment tab2 = new LoadSkillsFragment();
                return tab2;
            case 2:
                LoadInventoryFragment tab3 = new LoadInventoryFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}