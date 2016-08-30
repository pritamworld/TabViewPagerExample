
package com.adesa.interview.tabviewpagerexample.exampleloopj.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

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
     * 
     * @return
     *     The inventoryId
     */
    public long getInventoryId() {
        return inventoryId;
    }

    /**
     * 
     * @param inventoryId
     *     The inventoryId
     */
    public void setInventoryId(long inventoryId) {
        this.inventoryId = inventoryId;
    }

    /**
     * 
     * @return
     *     The userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The saleEventItemId
     */
    public long getSaleEventItemId() {
        return saleEventItemId;
    }

    /**
     * 
     * @param saleEventItemId
     *     The saleEventItemId
     */
    public void setSaleEventItemId(long saleEventItemId) {
        this.saleEventItemId = saleEventItemId;
    }

    /**
     * 
     * @return
     *     The storeId
     */
    public long getStoreId() {
        return storeId;
    }

    /**
     * 
     * @param storeId
     *     The storeId
     */
    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    /**
     * 
     * @return
     *     The transportCode
     */
    public Object getTransportCode() {
        return transportCode;
    }

    /**
     * 
     * @param transportCode
     *     The transportCode
     */
    public void setTransportCode(Object transportCode) {
        this.transportCode = transportCode;
    }

    /**
     * 
     * @return
     *     The quote
     */
    public long getQuote() {
        return quote;
    }

    /**
     * 
     * @param quote
     *     The quote
     */
    public void setQuote(long quote) {
        this.quote = quote;
    }

    /**
     * 
     * @return
     *     The subject
     */
    public Object getSubject() {
        return subject;
    }

    /**
     * 
     * @param subject
     *     The subject
     */
    public void setSubject(Object subject) {
        this.subject = subject;
    }

    /**
     * 
     * @return
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The trasnportCompanyName
     */
    public Object getTrasnportCompanyName() {
        return trasnportCompanyName;
    }

    /**
     * 
     * @param trasnportCompanyName
     *     The trasnportCompanyName
     */
    public void setTrasnportCompanyName(Object trasnportCompanyName) {
        this.trasnportCompanyName = trasnportCompanyName;
    }

    /**
     * 
     * @return
     *     The businessPhone
     */
    public Object getBusinessPhone() {
        return businessPhone;
    }

    /**
     * 
     * @param businessPhone
     *     The businessPhone
     */
    public void setBusinessPhone(Object businessPhone) {
        this.businessPhone = businessPhone;
    }

    /**
     * 
     * @return
     *     The trasnportCompanyNames
     */
    public List<Object> getTrasnportCompanyNames() {
        return trasnportCompanyNames;
    }

    /**
     * 
     * @param trasnportCompanyNames
     *     The trasnportCompanyNames
     */
    public void setTrasnportCompanyNames(List<Object> trasnportCompanyNames) {
        this.trasnportCompanyNames = trasnportCompanyNames;
    }

    /**
     * 
     * @return
     *     The dropOffAddress
     */
    public Object getDropOffAddress() {
        return dropOffAddress;
    }

    /**
     * 
     * @param dropOffAddress
     *     The dropOffAddress
     */
    public void setDropOffAddress(Object dropOffAddress) {
        this.dropOffAddress = dropOffAddress;
    }

    /**
     * 
     * @return
     *     The daysRequired
     */
    public long getDaysRequired() {
        return daysRequired;
    }

    /**
     * 
     * @param daysRequired
     *     The daysRequired
     */
    public void setDaysRequired(long daysRequired) {
        this.daysRequired = daysRequired;
    }

    /**
     * 
     * @return
     *     The quoteWithPromo
     */
    public Object getQuoteWithPromo() {
        return quoteWithPromo;
    }

    /**
     * 
     * @param quoteWithPromo
     *     The quoteWithPromo
     */
    public void setQuoteWithPromo(Object quoteWithPromo) {
        this.quoteWithPromo = quoteWithPromo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
