/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.daggerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.adesa.interview.tabviewpagerexample.R;
import com.moxdroid.interview.tabviewpagerexample.daggerexample.component.DaggerVehicleComponent;
import com.moxdroid.interview.tabviewpagerexample.daggerexample.component.VehicleComponent;
import com.moxdroid.interview.tabviewpagerexample.daggerexample.model.Vehicle;
import com.moxdroid.interview.tabviewpagerexample.daggerexample.module.VehicleModule;

public class DaggerActivity extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);


        VehicleComponent component = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();

        vehicle.increaseSpeed(10);

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
