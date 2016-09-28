/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.daggerexample.component;

import com.moxdroid.interview.tabviewpagerexample.daggerexample.model.Vehicle;
import com.moxdroid.interview.tabviewpagerexample.daggerexample.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by pritesh.patel on 2016-09-22, 12:01 PM.
 * Toronto, Canada
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
