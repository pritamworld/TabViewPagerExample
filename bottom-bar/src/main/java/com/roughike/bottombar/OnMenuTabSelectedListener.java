/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.roughike.bottombar;

import android.support.annotation.IdRes;

/**
 * @deprecated Use {@link OnMenuTabClickListener} instead
 */
@Deprecated
public interface OnMenuTabSelectedListener {
    /**
     * The method being called when currently visible {@link BottomBarTab} changes.
     * This listener won't be fired until the user changes the selected item the
     * first time. So you won't get this event when you're just initialized the
     * BottomBar.
     *
     * @param menuItemId the new visible tab's id that
     *                   was assigned in the menu xml resource file.
     */
    void onMenuItemSelected(@IdRes int menuItemId);
}
