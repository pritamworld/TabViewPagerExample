/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.roughike.bottombar;

public interface OnSizeDeterminedListener {
    /**
     * Called when the size of the BottomBar is determined and ready.
     *
     * @param size height or width of the BottomBar, depending on if
     *             the current device is a phone or a tablet.
     */
    void onSizeReady(int size);
}
