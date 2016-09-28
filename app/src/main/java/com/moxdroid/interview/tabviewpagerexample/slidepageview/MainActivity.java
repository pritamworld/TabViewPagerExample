/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.slidepageview;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.moxdroid.interview.tabviewpagerexample.R;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * The Adapter view pager.
     */
    FragmentPagerAdapter adapterViewPager;
    /**
     * The A.
     */
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a =5;

        a = a + 1;

        final ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);

        /// Attach the page change listener inside the activity
        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            // This method will be invoked when a new page becomes selected.
            @Override
            public void onPageSelected(int position) {
                Toast.makeText(MainActivity.this,
                        "Selected page position: " + position, Toast.LENGTH_SHORT).show();
                a = a + 1;
            }

            // This method will be invoked when the current page is scrolled
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // Code goes here
                if(position==3) vpPager.setCurrentItem(0,true);
            }

            // Called when the scroll state changes:
            // SCROLL_STATE_IDLE, SCROLL_STATE_DRAGGING, SCROLL_STATE_SETTLING
            @Override
            public void onPageScrollStateChanged(int state) {
                // Code goes here
                Log.d("TAG2","Page " + vpPager.getCurrentItem());
            }
        });
    }
}
