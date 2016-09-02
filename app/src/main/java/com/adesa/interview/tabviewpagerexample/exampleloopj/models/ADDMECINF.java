
/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample.exampleloopj.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Sets text.
     *
     * @param text The text
     */
    public void setText(Object text) {
        this.text = text;
    }

}
