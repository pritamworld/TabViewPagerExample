/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.roughike.bottombar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatDrawableManager;

class BottomBarItemBase {
    protected int iconResource;
    protected Drawable icon;
    protected int titleResource;
    protected String title;
    protected int color;

    protected Drawable getIcon(Context context) {
        if (this.iconResource != 0) {
            return AppCompatDrawableManager.get().getDrawable(context, iconResource);
        } else {
            return this.icon;
        }
    }

    protected String getTitle(Context context) {
        if (this.titleResource != 0) {
            return context.getString(this.titleResource);
        } else {
            return this.title;
        }
    }
}
