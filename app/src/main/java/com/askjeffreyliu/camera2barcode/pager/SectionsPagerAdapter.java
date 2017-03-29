package com.askjeffreyliu.camera2barcode.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by jeffreyliu on 3/25/17.
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<PlaceholderFragment> list;

    public SectionsPagerAdapter(FragmentManager fm, ArrayList<PlaceholderFragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
