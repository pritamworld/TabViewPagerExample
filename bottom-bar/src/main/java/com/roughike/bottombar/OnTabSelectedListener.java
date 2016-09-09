/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.roughike.bottombar;

/**
 * @deprecated Use {@link OnTabClickListener} instead.
 */
@Deprecated
public interface OnTabSelectedListener {
    /**
     * The method being called when currently visible {@link BottomBarTab} changes.
     * This listener won't be fired until the user changes the selected item the
     * first time. So you won't get this event when you're just initialized the
     * BottomBar.
     *
     * @param position the new visible {@link BottomBarTab}
     */
    void onItemSelected(int position);
}
