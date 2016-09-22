/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

import com.adesa.interview.tabviewpagerexample.R;

/**
 * The type Phone state listener activity.
 */
public class PhoneStateListenerActivity extends AppCompatActivity {

    /**
     * The T manager.
     */
    TelephonyManager tManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_state_listener);

        tManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
        tManager.listen(new CustomPhoneStateListener(this),
                PhoneStateListener.LISTEN_SIGNAL_STRENGTHS);
    }
}
