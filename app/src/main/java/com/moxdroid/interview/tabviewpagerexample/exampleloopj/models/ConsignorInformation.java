
/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.exampleloopj.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

/**
 * The type Consignor information.
 */
@Generated("org.jsonschema2pojo")
public class ConsignorInformation {

    @SerializedName("sellerName")
    @Expose
    private String sellerName;
    @SerializedName("vehicleLocationName")
    @Expose
    private String vehicleLocationName;
    @SerializedName("vehicleLocationCity")
    @Expose
    private String vehicleLocationCity;
    @SerializedName("vehicleLocationState")
    @Expose
    private String vehicleLocationState;
    @SerializedName("vehicleLocationPostalCode")
    @Expose
    private String vehicleLocationPostalCode;
    @SerializedName("vehicleLocationCountry")
    @Expose
    private String vehicleLocationCountry;
    @SerializedName("vehicleLocationLatitude")
    @Expose
    private double vehicleLocationLatitude;
    @SerializedName("vehicleLocationLongitude")
    @Expose
    private double vehicleLocationLongitude;
    @SerializedName("distance")
    @Expose
    private double distance;
    @SerializedName("marketGuideURL")
    @Expose
    private Object marketGuideURL;
    @SerializedName("marketGuidePrice")
    @Expose
    private Object marketGuidePrice;
    @SerializedName("information")
    @Expose
    private Object information;
    @SerializedName("promotion")
    @Expose
    private Object promotion;
    @SerializedName("certificationLogo")
    @Expose
    private Object certificationLogo;
    @SerializedName("certificationInfo")
    @Expose
    private Object certificationInfo;
    @SerializedName("msrp")
    @Expose
    private Object msrp;
    @SerializedName("countryId")
    @Expose
    private long countryId;
    @SerializedName("addressLine1")
    @Expose
    private String addressLine1;
    @SerializedName("addressLine2")
    @Expose
    private Object addressLine2;
    @SerializedName("businessPhone")
    @Expose
    private String businessPhone;

    /**
     * Gets seller name.
     *
     * @return The sellerName
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Sets seller name.
     *
     * @param sellerName The sellerName
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    /**
     * Gets vehicle location name.
     *
     * @return The vehicleLocationName
     */
    public String getVehicleLocationName() {
        return vehicleLocationName;
    }

    /**
     * Sets vehicle location name.
     *
     * @param vehicleLocationName The vehicleLocationName
     */
    public void setVehicleLocationName(String vehicleLocationName) {
        this.vehicleLocationName = vehicleLocationName;
    }

    /**
     * Gets vehicle location city.
     *
     * @return The vehicleLocationCity
     */
    public String getVehicleLocationCity() {
        return vehicleLocationCity;
    }

    /**
     * Sets vehicle location city.
     *
     * @param vehicleLocationCity The vehicleLocationCity
     */
    public void setVehicleLocationCity(String vehicleLocationCity) {
        this.vehicleLocationCity = vehicleLocationCity;
    }

    /**
     * Gets vehicle location state.
     *
     * @return The vehicleLocationState
     */
    public String getVehicleLocationState() {
        return vehicleLocationState;
    }

    /**
     * Sets vehicle location state.
     *
     * @param vehicleLocationState The vehicleLocationState
     */
    public void setVehicleLocationState(String vehicleLocationState) {
        this.vehicleLocationState = vehicleLocationState;
    }

    /**
     * Gets vehicle location postal code.
     *
     * @return The vehicleLocationPostalCode
     */
    public String getVehicleLocationPostalCode() {
        return vehicleLocationPostalCode;
    }

    /**
     * Sets vehicle location postal code.
     *
     * @param vehicleLocationPostalCode The vehicleLocationPostalCode
     */
    public void setVehicleLocationPostalCode(String vehicleLocationPostalCode) {
        this.vehicleLocationPostalCode = vehicleLocationPostalCode;
    }

    /**
     * Gets vehicle location country.
     *
     * @return The vehicleLocationCountry
     */
    public String getVehicleLocationCountry() {
        return vehicleLocationCountry;
    }

    /**
     * Sets vehicle location country.
     *
     * @param vehicleLocationCountry The vehicleLocationCountry
     */
    public void setVehicleLocationCountry(String vehicleLocationCountry) {
        this.vehicleLocationCountry = vehicleLocationCountry;
    }

    /**
     * Gets vehicle location latitude.
     *
     * @return The vehicleLocationLatitude
     */
    public double getVehicleLocationLatitude() {
        return vehicleLocationLatitude;
    }

    /**
     * Sets vehicle location latitude.
     *
     * @param vehicleLocationLatitude The vehicleLocationLatitude
     */
    public void setVehicleLocationLatitude(double vehicleLocationLatitude) {
        this.vehicleLocationLatitude = vehicleLocationLatitude;
    }

    /**
     * Gets vehicle location longitude.
     *
     * @return The vehicleLocationLongitude
     */
    public double getVehicleLocationLongitude() {
        return vehicleLocationLongitude;
    }

    /**
     * Sets vehicle location longitude.
     *
     * @param vehicleLocationLongitude The vehicleLocationLongitude
     */
    public void setVehicleLocationLongitude(double vehicleLocationLongitude) {
        this.vehicleLocationLongitude = vehicleLocationLongitude;
    }

    /**
     * Gets distance.
     *
     * @return The distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Sets distance.
     *
     * @param distance The distance
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Gets market guide url.
     *
     * @return The marketGuideURL
     */
    public Object getMarketGuideURL() {
        return marketGuideURL;
    }

    /**
     * Sets market guide url.
     *
     * @param marketGuideURL The marketGuideURL
     */
    public void setMarketGuideURL(Object marketGuideURL) {
        this.marketGuideURL = marketGuideURL;
    }

    /**
     * Gets market guide price.
     *
     * @return The marketGuidePrice
     */
    public Object getMarketGuidePrice() {
        return marketGuidePrice;
    }

    /**
     * Sets market guide price.
     *
     * @param marketGuidePrice The marketGuidePrice
     */
    public void setMarketGuidePrice(Object marketGuidePrice) {
        this.marketGuidePrice = marketGuidePrice;
    }

    /**
     * Gets information.
     *
     * @return The information
     */
    public Object getInformation() {
        return information;
    }

    /**
     * Sets information.
     *
     * @param information The information
     */
    public void setInformation(Object information) {
        this.information = information;
    }

    /**
     * Gets promotion.
     *
     * @return The promotion
     */
    public Object getPromotion() {
        return promotion;
    }

    /**
     * Sets promotion.
     *
     * @param promotion The promotion
     */
    public void setPromotion(Object promotion) {
        this.promotion = promotion;
    }

    /**
     * Gets certification logo.
     *
     * @return The certificationLogo
     */
    public Object getCertificationLogo() {
        return certificationLogo;
    }

    /**
     * Sets certification logo.
     *
     * @param certificationLogo The certificationLogo
     */
    public void setCertificationLogo(Object certificationLogo) {
        this.certificationLogo = certificationLogo;
    }

    /**
     * Gets certification info.
     *
     * @return The certificationInfo
     */
    public Object getCertificationInfo() {
        return certificationInfo;
    }

    /**
     * Sets certification info.
     *
     * @param certificationInfo The certificationInfo
     */
    public void setCertificationInfo(Object certificationInfo) {
        this.certificationInfo = certificationInfo;
    }

    /**
     * Gets msrp.
     *
     * @return The msrp
     */
    public Object getMsrp() {
        return msrp;
    }

    /**
     * Sets msrp.
     *
     * @param msrp The msrp
     */
    public void setMsrp(Object msrp) {
        this.msrp = msrp;
    }

    /**
     * Gets country id.
     *
     * @return The countryId
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets country id.
     *
     * @param countryId The countryId
     */
    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    /**
     * Gets address line 1.
     *
     * @return The addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets address line 1.
     *
     * @param addressLine1 The addressLine1
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Gets address line 2.
     *
     * @return The addressLine2
     */
    public Object getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets address line 2.
     *
     * @param addressLine2 The addressLine2
     */
    public void setAddressLine2(Object addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Gets business phone.
     *
     * @return The businessPhone
     */
    public String getBusinessPhone() {
        return businessPhone;
    }

    /**
     * Sets business phone.
     *
     * @param businessPhone The businessPhone
     */
    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
