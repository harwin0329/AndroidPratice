package com.example.harwin.androidpratice;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainPagerAdapter extends PagerAdapter {

    public ArrayList<View> mViewlist = new ArrayList<View>();

    public MainPagerAdapter(ArrayList<View> mViewlist) {
        this.mViewlist = mViewlist;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(mViewlist.get(position));
        return mViewlist.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(mViewlist.get(position));
    }

    @Override
    public int getCount() {
        return mViewlist.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "title" + position +"";
    }
}
