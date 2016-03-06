package com.faveoffate.whdatasheet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CreateFragmentPageAdapter extends FragmentPagerAdapter{
    int mNumOfTabs;

    public CreateFragmentPageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                CreateStatsFragment tab1 = new CreateStatsFragment();
                return tab1;
            case 1:
                CreateSkillsFragment tab2 = new CreateSkillsFragment();
                return tab2;
            case 2:
                CreateInventoryFragment tab3 = new CreateInventoryFragment();
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
