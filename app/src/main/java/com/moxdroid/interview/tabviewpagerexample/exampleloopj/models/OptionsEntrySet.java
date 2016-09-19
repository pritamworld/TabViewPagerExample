
/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.exampleloopj.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

/**
 * The type Options entry set.
 */
@Generated("org.jsonschema2pojo")
public class OptionsEntrySet {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("value")
    @Expose
    private String value;

    /**
     * Gets key.
     *
     * @return The key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets key.
     *
     * @param key The key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Gets value.
     *
     * @return The value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value The value
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
