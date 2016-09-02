/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample.activitytofragment;

/**
 * The interface Fragment to activity.
 */
public interface IFragmentToActivity {
    /**
     * Show toast.
     *
     * @param msg the msg
     */
    void showToast(String msg);

    /**
     * Communicate to fragment 2.
     */
    void communicateToFragment2();
}
