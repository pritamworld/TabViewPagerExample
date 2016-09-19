
/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.exampleloopj.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

/**
 * The type Transportation quote dto.
 */
@Generated("org.jsonschema2pojo")
public class TransportationQuoteDTO {

    @SerializedName("inventoryId")
    @Expose
    private long inventoryId;
    @SerializedName("userId")
    @Expose
    private long userId;
    @SerializedName("saleEventItemId")
    @Expose
    private long saleEventItemId;
    @SerializedName("storeId")
    @Expose
    private long storeId;
    @SerializedName("transportCode")
    @Expose
    private Object transportCode;
    @SerializedName("quote")
    @Expose
    private long quote;
    @SerializedName("subject")
    @Expose
    private Object subject;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("trasnportCompanyName")
    @Expose
    private Object trasnportCompanyName;
    @SerializedName("businessPhone")
    @Expose
    private Object businessPhone;
    @SerializedName("trasnportCompanyNames")
    @Expose
    private List<Object> trasnportCompanyNames = new ArrayList<Object>();
    @SerializedName("dropOffAddress")
    @Expose
    private Object dropOffAddress;
    @SerializedName("daysRequired")
    @Expose
    private long daysRequired;
    @SerializedName("quoteWithPromo")
    @Expose
    private Object quoteWithPromo;

    /**
     * Gets inventory id.
     *
     * @return The inventoryId
     */
    public long getInventoryId() {
        return inventoryId;
    }

    /**
     * Sets inventory id.
     *
     * @param inventoryId The inventoryId
     */
    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }

    /**
     * Gets user id.
     *
     * @return The userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId The userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * Gets sale event item id.
     *
     * @return The saleEventItemId
     */
    public long getSaleEventItemId() {
        return saleEventItemId;
    }

    /**
     * Sets sale event item id.
     *
     * @param saleEventItemId The saleEventItemId
     */
    public void setSaleEventItemId(long saleEventItemId) {
        this.saleEventItemId = saleEventItemId;
    }

    /**
     * Gets store id.
     *
     * @return The storeId
     */
    public long getStoreId() {
        return storeId;
    }

    /**
     * Sets store id.
     *
     * @param storeId The storeId
     */
    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    /**
     * Gets transport code.
     *
     * @return The transportCode
     */
    public Object getTransportCode() {
        return transportCode;
    }

    /**
     * Sets transport code.
     *
     * @param transportCode The transportCode
     */
    public void setTransportCode(Object transportCode) {
        this.transportCode = transportCode;
    }

    /**
     * Gets quote.
     *
     * @return The quote
     */
    public long getQuote() {
        return quote;
    }

    /**
     * Sets quote.
     *
     * @param quote The quote
     */
    public void setQuote(long quote) {
        this.quote = quote;
    }

    /**
     * Gets subject.
     *
     * @return The subject
     */
    public Object getSubject() {
        return subject;
    }

    /**
     * Sets subject.
     *
     * @param subject The subject
     */
    public void setSubject(Object subject) {
        this.subject = subject;
    }

    /**
     * Gets price.
     *
     * @return The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Gets trasnport company name.
     *
     * @return The trasnportCompanyName
     */
    public Object getTrasnportCompanyName() {
        return trasnportCompanyName;
    }

    /**
     * Sets trasnport company name.
     *
     * @param trasnportCompanyName The trasnportCompanyName
     */
    public void setTrasnportCompanyName(Object trasnportCompanyName) {
        this.trasnportCompanyName = trasnportCompanyName;
    }

    /**
     * Gets business phone.
     *
     * @return The businessPhone
     */
    public Object getBusinessPhone() {
        return businessPhone;
    }

    /**
     * Sets business phone.
     *
     * @param businessPhone The businessPhone
     */
    public void setBusinessPhone(Object businessPhone) {
        this.businessPhone = businessPhone;
    }

    /**
     * Gets trasnport company names.
     *
     * @return The trasnportCompanyNames
     */
    public List<Object> getTrasnportCompanyNames() {
        return trasnportCompanyNames;
    }

    /**
     * Sets trasnport company names.
     *
     * @param trasnportCompanyNames The trasnportCompanyNames
     */
    public void setTrasnportCompanyNames(List<Object> trasnportCompanyNames) {
        this.trasnportCompanyNames = trasnportCompanyNames;
    }

    /**
     * Gets drop off address.
     *
     * @return The dropOffAddress
     */
    public Object getDropOffAddress() {
        return dropOffAddress;
    }

    /**
     * Sets drop off address.
     *
     * @param dropOffAddress The dropOffAddress
     */
    public void setDropOffAddress(Object dropOffAddress) {
        this.dropOffAddress = dropOffAddress;
    }

    /**
     * Gets days required.
     *
     * @return The daysRequired
     */
    public long getDaysRequired() {
        return daysRequired;
    }

    /**
     * Sets days required.
     *
     * @param daysRequired The daysRequired
     */
    public void setDaysRequired(long daysRequired) {
        this.daysRequired = daysRequired;
    }

    /**
     * Gets quote with promo.
     *
     * @return The quoteWithPromo
     */
    public Object getQuoteWithPromo() {
        return quoteWithPromo;
    }

    /**
     * Sets quote with promo.
     *
     * @param quoteWithPromo The quoteWithPromo
     */
    public void setQuoteWithPromo(Object quoteWithPromo) {
        this.quoteWithPromo = quoteWithPromo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
