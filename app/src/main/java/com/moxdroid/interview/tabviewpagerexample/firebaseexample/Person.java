/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.firebaseexample;

/**
 * Created by pritesh.patel on 2016-09-07, 1:20 PM.
 * ADESA, Canada
 */
public class Person {
    private String name;
    private String address;

    public Person() {
      /*Blank default constructor essential for Firebase*/
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
