package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by toddskinner on 11/1/16.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter (Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    private Context mContext;

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MainFragment();
        } else if (position == 1){
            return new HotelsFragment();
        } else if (position == 2){
            return new SightsFragment();
        } else if (position == 3){
            return new RestaurantsFragment();
        } else {
            return new BarsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.mainpage_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.hotels_fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.sights_fragment);
        } else if (position == 3){
            return mContext.getString(R.string.restaurants_fragment);
        } else {
            return mContext.getString(R.string.bars_fragment);
        }
    }
}
