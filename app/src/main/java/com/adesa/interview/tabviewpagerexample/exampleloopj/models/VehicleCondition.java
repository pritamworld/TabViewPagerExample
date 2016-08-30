
package com.adesa.interview.tabviewpagerexample.exampleloopj.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

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
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 
     * @param grade
     *     The grade
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 
     * @return
     *     The estimateSubTotal
     */
    public Object getEstimateSubTotal() {
        return estimateSubTotal;
    }

    /**
     * 
     * @param estimateSubTotal
     *     The estimateSubTotal
     */
    public void setEstimateSubTotal(Object estimateSubTotal) {
        this.estimateSubTotal = estimateSubTotal;
    }

    /**
     * 
     * @return
     *     The normalWearAndTearSubTotal
     */
    public Object getNormalWearAndTearSubTotal() {
        return normalWearAndTearSubTotal;
    }

    /**
     * 
     * @param normalWearAndTearSubTotal
     *     The normalWearAndTearSubTotal
     */
    public void setNormalWearAndTearSubTotal(Object normalWearAndTearSubTotal) {
        this.normalWearAndTearSubTotal = normalWearAndTearSubTotal;
    }

    /**
     * 
     * @return
     *     The excessWearAndTearSubTotal
     */
    public Object getExcessWearAndTearSubTotal() {
        return excessWearAndTearSubTotal;
    }

    /**
     * 
     * @param excessWearAndTearSubTotal
     *     The excessWearAndTearSubTotal
     */
    public void setExcessWearAndTearSubTotal(Object excessWearAndTearSubTotal) {
        this.excessWearAndTearSubTotal = excessWearAndTearSubTotal;
    }

    /**
     * 
     * @return
     *     The damages
     */
    public List<Object> getDamages() {
        return damages;
    }

    /**
     * 
     * @param damages
     *     The damages
     */
    public void setDamages(List<Object> damages) {
        this.damages = damages;
    }

    /**
     * 
     * @return
     *     The isDamageExists
     */
    public boolean isIsDamageExists() {
        return isDamageExists;
    }

    /**
     * 
     * @param isDamageExists
     *     The isDamageExists
     */
    public void setIsDamageExists(boolean isDamageExists) {
        this.isDamageExists = isDamageExists;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
