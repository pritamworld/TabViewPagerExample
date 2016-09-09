/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.roughike.bottombar;

import android.support.annotation.IdRes;

public interface OnMenuTabClickListener {
    /**
     * The method being called when currently visible {@link BottomBarTab} changes.
     * <p/>
     * This listener is fired for the first time after the items have been set and
     * also after a configuration change, such as when screen orientation changes
     * from portrait to landscape.
     *
     * @param menuItemId the new visible tab's id that
     *                   was assigned in the menu xml resource file.
     */
    void onMenuTabSelected(@IdRes int menuItemId);

    /**
     * The method being called when currently visible {@link BottomBarTab} is
     * reselected. Use this method for scrolling to the top of your content,
     * as recommended by the Material Design spec
     *
     * @param menuItemId the reselected tab's id that was assigned in the menu
     *                   xml resource file.
     */
    void onMenuTabReSelected(@IdRes int menuItemId);
}
