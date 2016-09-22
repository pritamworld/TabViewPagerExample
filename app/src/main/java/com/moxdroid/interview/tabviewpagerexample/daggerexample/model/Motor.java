/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.daggerexample.model;

/**
 * Created by pritesh.patel on 2016-09-22, 11:58 AM.
 * Toronto, Canada
 */

public class Motor {
    private int rpm;

    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value) {
        rpm = rpm + value;
    }

    public void brake() {
        rpm = 0;
    }
}
