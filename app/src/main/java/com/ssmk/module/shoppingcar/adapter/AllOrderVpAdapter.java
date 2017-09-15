package com.ssmk.module.shoppingcar.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * author：郑志强
 * data：2017/7/8 9:39
 * function：
 */

public class AllOrderVpAdapter extends FragmentPagerAdapter {
    private String[] mTitles;
    private List<Fragment> mList;

    public AllOrderVpAdapter(FragmentManager fm, String[] titles, List<Fragment> list) {
        super(fm);
        mTitles = titles;
        mList = list;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
