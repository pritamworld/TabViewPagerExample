/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.webapp;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

/**
 * Created by pritesh.patel on 2016-09-23, 3:19 PM.
 * ADESA, Canada
 */

public class WebAppInterface {
    Context mContext;

    /**
     * Instantiate the interface and set the context
     */
    WebAppInterface(Context c) {
        mContext = c;
    }

    /**
     * Show a toast from the web page
     */
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
}
