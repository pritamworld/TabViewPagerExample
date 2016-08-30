
package com.adesa.interview.tabviewpagerexample.exampleloopj.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Tire {

    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("wheel")
    @Expose
    private String wheel;
    @SerializedName("treadDepth")
    @Expose
    private String treadDepth;
    @SerializedName("location")
    @Expose
    private String location;

    /**
     * 
     * @return
     *     The brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 
     * @param brand
     *     The brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return
     *     The size
     */
    public String getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The wheel
     */
    public String getWheel() {
        return wheel;
    }

    /**
     * 
     * @param wheel
     *     The wheel
     */
    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    /**
     * 
     * @return
     *     The treadDepth
     */
    public String getTreadDepth() {
        return treadDepth;
    }

    /**
     * 
     * @param treadDepth
     *     The treadDepth
     */
    public void setTreadDepth(String treadDepth) {
        this.treadDepth = treadDepth;
    }

    /**
     * 
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
