/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.exampleloopj;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Interview on 2016-08-17.
 */
public class PreferencesManager {
    private static final String PREF_NAME = "com.adesa.interview.tabviewpagerexample.PREF_NAME";
    private static final String KEY_VALUE = "com.adesa.interview.tabviewpagerexample.KEY_VALUE";

    private static PreferencesManager sInstance;
    private final SharedPreferences mPref;

    private PreferencesManager(Context context) {
        mPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    /**
     * Initialize instance.
     *
     * @param context the context
     */
    public static synchronized void initializeInstance(Context context) {
        if (sInstance == null) {
            sInstance = new PreferencesManager(context);
        }
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static synchronized PreferencesManager getInstance() {
        if (sInstance == null) {
            throw new IllegalStateException(PreferencesManager.class.getSimpleName() +
                    " is not initialized, call initializeInstance(..) method first.");
        }
        return sInstance;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public long getValue() {
        return mPref.getLong(KEY_VALUE, 0);
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(long value) {
        mPref.edit()
                .putLong(KEY_VALUE, value)
                .commit();
    }

    /**
     * Remove.
     *
     * @param key the key
     */
    public void remove(String key) {
        mPref.edit()
                .remove(key)
                .commit();
    }

    /**
     * Clear boolean.
     *
     * @return the boolean
     */
    public boolean clear() {
        return mPref.edit()
                .clear()
                .commit();
    }
}
