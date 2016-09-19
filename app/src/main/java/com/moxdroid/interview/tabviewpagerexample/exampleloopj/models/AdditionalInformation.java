
/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.exampleloopj.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

/**
 * The type Additional information.
 */
@Generated("org.jsonschema2pojo")
public class AdditionalInformation {

    @SerializedName("ADD_INT_INF")
    @Expose
    private ADDINTINF aDDINTINF;
    @SerializedName("ADD_EXT_INF")
    @Expose
    private ADDEXTINF aDDEXTINF;
    @SerializedName("ADD_MEC_INF")
    @Expose
    private ADDMECINF aDDMECINF;

    /**
     * Gets addintinf.
     *
     * @return The aDDINTINF
     */
    public ADDINTINF getADDINTINF() {
        return aDDINTINF;
    }

    /**
     * Sets addintinf.
     *
     * @param aDDINTINF The ADD_INT_INF
     */
    public void setADDINTINF(ADDINTINF aDDINTINF) {
        this.aDDINTINF = aDDINTINF;
    }

    /**
     * Gets addextinf.
     *
     * @return The aDDEXTINF
     */
    public ADDEXTINF getADDEXTINF() {
        return aDDEXTINF;
    }

    /**
     * Sets addextinf.
     *
     * @param aDDEXTINF The ADD_EXT_INF
     */
    public void setADDEXTINF(ADDEXTINF aDDEXTINF) {
        this.aDDEXTINF = aDDEXTINF;
    }

    /**
     * Gets addmecinf.
     *
     * @return The aDDMECINF
     */
    public ADDMECINF getADDMECINF() {
        return aDDMECINF;
    }

    /**
     * Sets addmecinf.
     *
     * @param aDDMECINF The ADD_MEC_INF
     */
    public void setADDMECINF(ADDMECINF aDDMECINF) {
        this.aDDMECINF = aDDMECINF;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
