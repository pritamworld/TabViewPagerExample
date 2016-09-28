
/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.exampleloopj.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

/**
 * The type Vehicle condition.
 */
@Generated("org.jsonschema2pojo")
public class VehicleCondition {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("grade")
    @Expose
    private String grade;
    @SerializedName("estimateSubTotal")
    @Expose
    private Object estimateSubTotal;
    @SerializedName("normalWearAndTearSubTotal")
    @Expose
    private Object normalWearAndTearSubTotal;
    @SerializedName("excessWearAndTearSubTotal")
    @Expose
    private Object excessWearAndTearSubTotal;
    @SerializedName("damages")
    @Expose
    private List<Object> damages = new ArrayList<Object>();
    @SerializedName("isDamageExists")
    @Expose
    private boolean isDamageExists;

    /**
     * Gets type.
     *
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets grade.
     *
     * @return The grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets grade.
     *
     * @param grade The grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * Gets estimate sub total.
     *
     * @return The estimateSubTotal
     */
    public Object getEstimateSubTotal() {
        return estimateSubTotal;
    }

    /**
     * Sets estimate sub total.
     *
     * @param estimateSubTotal The estimateSubTotal
     */
    public void setEstimateSubTotal(Object estimateSubTotal) {
        this.estimateSubTotal = estimateSubTotal;
    }

    /**
     * Gets normal wear and tear sub total.
     *
     * @return The normalWearAndTearSubTotal
     */
    public Object getNormalWearAndTearSubTotal() {
        return normalWearAndTearSubTotal;
    }

    /**
     * Sets normal wear and tear sub total.
     *
     * @param normalWearAndTearSubTotal The normalWearAndTearSubTotal
     */
    public void setNormalWearAndTearSubTotal(Object normalWearAndTearSubTotal) {
        this.normalWearAndTearSubTotal = normalWearAndTearSubTotal;
    }

    /**
     * Gets excess wear and tear sub total.
     *
     * @return The excessWearAndTearSubTotal
     */
    public Object getExcessWearAndTearSubTotal() {
        return excessWearAndTearSubTotal;
    }

    /**
     * Sets excess wear and tear sub total.
     *
     * @param excessWearAndTearSubTotal The excessWearAndTearSubTotal
     */
    public void setExcessWearAndTearSubTotal(Object excessWearAndTearSubTotal) {
        this.excessWearAndTearSubTotal = excessWearAndTearSubTotal;
    }

    /**
     * Gets damages.
     *
     * @return The damages
     */
    public List<Object> getDamages() {
        return damages;
    }

    /**
     * Sets damages.
     *
     * @param damages The damages
     */
    public void setDamages(List<Object> damages) {
        this.damages = damages;
    }

    /**
     * Is is damage exists boolean.
     *
     * @return The isDamageExists
     */
    public boolean isIsDamageExists() {
        return isDamageExists;
    }

    /**
     * Sets is damage exists.
     *
     * @param isDamageExists The isDamageExists
     */
    public void setIsDamageExists(boolean isDamageExists) {
        this.isDamageExists = isDamageExists;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
