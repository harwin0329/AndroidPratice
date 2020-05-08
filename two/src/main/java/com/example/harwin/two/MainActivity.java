package com.example.harwin.two;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import util.Utils;

public class MainActivity extends AppCompatActivity implements MyFragment.OnFragmentInteractionListener {
    private ViewPager viewPager;
    private PagerTabStrip tabStrip;
    private PagerTitleStrip titleStrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        viewPager = findViewById(R.id.viewPager);
//        viewPager.setAdapter(new MyPagerAdapter());

//        tabStrip = findViewById(R.id.tabStrip);
//        titleStrip = findViewById(R.id.titleStrip);
//        tabStrip.setBackgroundColor(Color.red(1));


        TextView tv_0 = findViewById(R.id.tv_0);
        tv_0.setText("getSystemDensity:" + Utils.getSystemDensity(MainActivity.this)
                +"\n"+"getScreenDensity:" + Utils.getScreenDensity(MainActivity.this)
                +"\n"+"getScreenWidthPixels:" + Utils.getScreenWidthPixels(MainActivity.this)
                +"\n"+"getScreenHeightPixels:" + Utils.getScreenHeightPixels(MainActivity.this));


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }


    private class MyPagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == o;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
//            return super.instantiateItem(container, position);
            TextView textView = new TextView(MainActivity.this);
            textView.setText("" + position);
            textView.setGravity(Gravity.CENTER);
            container.addView(textView);
            //最后要返回的是控件本身
            return textView;
        }


        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return ("标题" + position);
        }

        @Override
        public float getPageWidth(int position) {
            return 100;
        }


    }
}
