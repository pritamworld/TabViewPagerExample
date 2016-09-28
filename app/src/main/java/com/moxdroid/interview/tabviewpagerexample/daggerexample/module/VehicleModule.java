/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.daggerexample.module;

import com.moxdroid.interview.tabviewpagerexample.daggerexample.model.Motor;
import com.moxdroid.interview.tabviewpagerexample.daggerexample.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pritesh.patel on 2016-09-22, 12:00 PM.
 * Toronto, Canada
 */
@Module
public class VehicleModule {
    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
