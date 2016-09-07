/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Interview on 2016-08-16.
 */

public class AppConfig extends Application {
    /**
     * The constant ENCRYPTED.
     */
    public static final boolean ENCRYPTED = true;

    //Test change
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
