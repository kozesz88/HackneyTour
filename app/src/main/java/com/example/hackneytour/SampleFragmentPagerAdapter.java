package com.example.hackneytour;


import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    /**
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    SampleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CafeFragment();
        } else if (position == 1) {
            return new PubsFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new CultureFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_cafe);
        } else if (position == 1) {
            return mContext.getString(R.string.category_pubs);
        } else if (position == 2) {
            return mContext.getString(R.string.category_parks);
        } else {
            return mContext.getString(R.string.category_culture);
        }
    }
}