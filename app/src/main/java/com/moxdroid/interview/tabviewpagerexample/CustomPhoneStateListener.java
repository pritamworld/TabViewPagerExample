/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample;


import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * The type Custom phone state listener.
 */
public class CustomPhoneStateListener extends PhoneStateListener {
    /**
     * The constant LOG_TAG.
     */
    public static String LOG_TAG = CustomPhoneStateListener.class.getSimpleName();
    /**
     * The M context.
     */
    Context mContext;

    /**
     * Instantiates a new Custom phone state listener.
     *
     * @param context the context
     */
    public CustomPhoneStateListener(Context context) {
        mContext = context;
    }

    /**
     * In this method Java Reflection API is being used please see link before
     * using.
     *
     * @see <a
     * href="http://docs.oracle.com/javase/tutorial/reflect/">http://docs.oracle.com/javase/tutorial/reflect/</a>
     */
    @Override
    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        super.onSignalStrengthsChanged(signalStrength);
        Log.i(LOG_TAG, "onSignalStrengthsChanged: " + signalStrength);
        if (signalStrength.isGsm()) {
            Log.i(LOG_TAG, "onSignalStrengthsChanged: getGsmBitErrorRate "
                    + signalStrength.getGsmBitErrorRate());
            Log.i(LOG_TAG, "onSignalStrengthsChanged: getGsmSignalStrength "
                    + signalStrength.getGsmSignalStrength());
        } else if (signalStrength.getCdmaDbm() > 0) {
            Log.i(LOG_TAG, "onSignalStrengthsChanged: getCdmaDbm "
                    + signalStrength.getCdmaDbm());
            Log.i(LOG_TAG, "onSignalStrengthsChanged: getCdmaEcio "
                    + signalStrength.getCdmaEcio());
        } else {
            Log.i(LOG_TAG, "onSignalStrengthsChanged: getEvdoDbm "
                    + signalStrength.getEvdoDbm());
            Log.i(LOG_TAG, "onSignalStrengthsChanged: getEvdoEcio "
                    + signalStrength.getEvdoEcio());
            Log.i(LOG_TAG, "onSignalStrengthsChanged: getEvdoSnr "
                    + signalStrength.getEvdoSnr());
        }

        // Reflection code starts from here
        try {
            Method[] methods = android.telephony.SignalStrength.class
                    .getMethods();
            for (Method mthd : methods) {
                if (mthd.getName().equals("getLteSignalStrength")
                        || mthd.getName().equals("getLteRsrp")
                        || mthd.getName().equals("getLteRsrq")
                        || mthd.getName().equals("getLteRssnr")
                        || mthd.getName().equals("getLteCqi")) {
                    Log.i(LOG_TAG,
                            "onSignalStrengthsChanged: " + mthd.getName() + " "
                                    + mthd.invoke(signalStrength));
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // Reflection code ends here
    }
}