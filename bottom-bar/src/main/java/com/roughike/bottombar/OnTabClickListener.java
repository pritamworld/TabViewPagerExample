/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.roughike.bottombar;

public interface OnTabClickListener {
    /**
     * The method being called when currently visible {@link BottomBarTab} changes.
     * <p/>
     * This listener is fired for the first time after the items have been set and
     * also after a configuration change, such as when screen orientation changes
     * from portrait to landscape.
     *
     * @param position the new visible {@link BottomBarTab}
     */
    void onTabSelected(int position);

    /**
     * The method being called when currently visible {@link BottomBarTab} is
     * reselected. Use this method for scrolling to the top of your content,
     * as recommended by the Material Design spec
     *
     * @param position the {@link BottomBarTab} that was reselected.
     */
    void onTabReSelected(int position);
}
