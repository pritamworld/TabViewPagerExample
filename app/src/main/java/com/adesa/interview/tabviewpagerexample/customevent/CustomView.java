/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample.customevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by pritesh.patel on 2016-09-09, 3:26 PM.
 * ADESA, Canada
 */
public class CustomView extends View {
    OnCustomEventListener mListener;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setCustomEventListener(OnCustomEventListener eventListener) {
        mListener = eventListener;
    }

    public interface OnCustomEventListener {
        void onEvent();
    }
}
