/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample.tabpageview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import com.adesa.interview.tabviewpagerexample.R;

/**
 * Created by Interview on 2016-08-08.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    /**
     * The Page count.
     */
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
    private Context context;
    private int[] imageResId = {
            R.mipmap.ic_launcher
            //R.drawable.ic_two,
            //R.drawable.ic_three
    };

    /**
     * Instantiates a new Sample fragment pager adapter.
     *
     * @param fm      the fm
     * @param context the context
     */
    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        //return tabTitles[position];
        // Generate title based on item position
        //imageResId[position]
        Drawable image = context.getResources().getDrawable(imageResId[0]);
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
        // Replace blank spaces with image icon
        SpannableString sb = new SpannableString("   " + tabTitles[position]);
        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return sb;
    }
}
