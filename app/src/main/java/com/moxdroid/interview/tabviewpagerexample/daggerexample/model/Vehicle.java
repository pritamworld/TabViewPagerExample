/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by pritesh.patel on 2016-09-22, 11:59 AM.
 * Toronto, Canada
 */

public class Vehicle {
    private Motor motor;

    @Inject
    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }
}
