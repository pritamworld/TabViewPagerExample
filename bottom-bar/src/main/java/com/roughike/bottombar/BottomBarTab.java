/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.roughike.bottombar;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

public class BottomBarTab extends BottomBarItemBase {
    protected int id = -1;

    /**
     * Creates a new Tab for the BottomBar.
     *
     * @param iconResource a resource for the Tab icon.
     * @param title        title for the Tab.
     */
    public BottomBarTab(@DrawableRes int iconResource, @NonNull String title) {
        this.iconResource = iconResource;
        this.title = title;
    }

    /**
     * Creates a new Tab for the BottomBar.
     *
     * @param icon  an icon for the Tab.
     * @param title title for the Tab.
     */
    public BottomBarTab(Drawable icon, @NonNull String title) {
        this.icon = icon;
        this.title = title;
    }

    /**
     * Creates a new Tab for the BottomBar.
     *
     * @param icon          an icon for the Tab.
     * @param titleResource resource for the title.
     */
    public BottomBarTab(Drawable icon, @StringRes int titleResource) {
        this.icon = icon;
        this.titleResource = titleResource;
    }

    /**
     * Creates a new Tab for the BottomBar.
     *
     * @param iconResource  a resource for the Tab icon.
     * @param titleResource resource for the title.
     */
    public BottomBarTab(@DrawableRes int iconResource, @StringRes int titleResource) {
        this.iconResource = iconResource;
        this.titleResource = titleResource;
    }
}
