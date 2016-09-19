/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.priteshpatel.priteshtestlibrary.MyView;

/**
 * The type Custom library test activity.
 */
public class CustomLibraryTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View v = new MyView(this);
        setContentView(v);

    }
}
