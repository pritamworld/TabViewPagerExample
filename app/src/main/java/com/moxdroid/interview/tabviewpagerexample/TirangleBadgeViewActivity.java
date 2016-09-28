/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Toast;

import butterknife.ButterKnife;

public class TirangleBadgeViewActivity extends AppCompatActivity {

    public static final String TAG = TirangleBadgeViewActivity.class.getCanonicalName();

    private static boolean isTabletDevice(Context activityContext) {
        boolean device_large = ((activityContext.getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                Configuration.SCREENLAYOUT_SIZE_LARGE);

        if (device_large) {
            DisplayMetrics metrics = new DisplayMetrics();
            Activity activity = (Activity) activityContext;
            activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);

            if (metrics.densityDpi == DisplayMetrics.DENSITY_DEFAULT
                    || metrics.densityDpi == DisplayMetrics.DENSITY_HIGH
                    || metrics.densityDpi == DisplayMetrics.DENSITY_MEDIUM
                    || metrics.densityDpi == DisplayMetrics.DENSITY_TV
                    || metrics.densityDpi == DisplayMetrics.DENSITY_XHIGH) {
                Log.d(TAG, "isTabletDevice: TRUE ");
                return true;
            }
        }
        Log.d(TAG, "isTabletDevice: FALSE");
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tirangle_badge_view);
        ButterKnife.inject(this);

        if (getResources().getBoolean(R.bool.isTab)) {
            Toast.makeText(this, "tablet", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "mobile", Toast.LENGTH_SHORT).show();
        }

        isTabletDevice(this);
        String s = "Debug-infos:";
        s += "\n OS Version: " + System.getProperty("os.version") + "(" + android.os.Build.VERSION.INCREMENTAL + ")";
        s += "\n OS API Level: " + android.os.Build.VERSION.SDK;
        s += "\n Device: " + android.os.Build.DEVICE;
        s += "\n Model (and Product): " + android.os.Build.MODEL + " (" + android.os.Build.PRODUCT + ")";

        Log.d(TAG, s);
    }

}
