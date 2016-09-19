
/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.exampleloopj.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

/**
 * The type Addmecinf.
 */
@Generated("org.jsonschema2pojo")
public class ADDMECINF {

    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("text")
    @Expose
    private Object text;

    /**
     * Gets type.
     *
     * @return The type
     */
    public Object getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type The type
     */
    public void setType(Object type) {
        this.type = type;
    }

    /**
     * Gets text.
     *
     * @return The text
     */
    public Object getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text The text
     */
    public void setText(Object text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
