package com.adesa.interview.tabviewpagerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public class PhoneStateListenerActivity extends AppCompatActivity {

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
