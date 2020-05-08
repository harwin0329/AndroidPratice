package com.example.harwin.androidpratice;

import android.graphics.Color;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private PagerTitleStrip pagerTitleStrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        pagerTitleStrip = findViewById(R.id.pagerTitleStrip);



        ArrayList<View> mViewlist = new ArrayList<View>();

        for (int i = 0; i < 3 ; i++) {
            TextView view = new TextView(MainActivity.this);
            view.setText("第"+i +"页");
            mViewlist.add(view);
        }

        pagerTitleStrip.setTextColor(Color.RED);
        pagerTitleStrip.setTextSize(1,40);
        viewPager.setAdapter(new MainPagerAdapter(mViewlist));

    }
}
