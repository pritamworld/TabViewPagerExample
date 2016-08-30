
package com.adesa.interview.tabviewpagerexample.exampleloopj.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

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
     * 
     * @return
     *     The aDDINTINF
     */
    public ADDINTINF getADDINTINF() {
        return aDDINTINF;
    }

    /**
     * 
     * @param aDDINTINF
     *     The ADD_INT_INF
     */
    public void setADDINTINF(ADDINTINF aDDINTINF) {
        this.aDDINTINF = aDDINTINF;
    }

    /**
     * 
     * @return
     *     The aDDEXTINF
     */
    public ADDEXTINF getADDEXTINF() {
        return aDDEXTINF;
    }

    /**
     * 
     * @param aDDEXTINF
     *     The ADD_EXT_INF
     */
    public void setADDEXTINF(ADDEXTINF aDDEXTINF) {
        this.aDDEXTINF = aDDEXTINF;
    }

    /**
     * 
     * @return
     *     The aDDMECINF
     */
    public ADDMECINF getADDMECINF() {
        return aDDMECINF;
    }

    /**
     * 
     * @param aDDMECINF
     *     The ADD_MEC_INF
     */
    public void setADDMECINF(ADDMECINF aDDMECINF) {
        this.aDDMECINF = aDDMECINF;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
