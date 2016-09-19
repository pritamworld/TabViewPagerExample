
/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.exampleloopj.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

/**
 * The type Oem information.
 */
@Generated("org.jsonschema2pojo")
public class OemInformation {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("packageDetails")
    @Expose
    private String packageDetails;

    /**
     * Gets code.
     *
     * @return The code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets description.
     *
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets package details.
     *
     * @return The packageDetails
     */
    public String getPackageDetails() {
        return packageDetails;
    }

    /**
     * Sets package details.
     *
     * @param packageDetails The packageDetails
     */
    public void setPackageDetails(String packageDetails) {
        this.packageDetails = packageDetails;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
