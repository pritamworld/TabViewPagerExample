
package com.adesa.interview.tabviewpagerexample.exampleloopj.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

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
     * 
     * @return
     *     The code
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The packageDetails
     */
    public String getPackageDetails() {
        return packageDetails;
    }

    /**
     * 
     * @param packageDetails
     *     The packageDetails
     */
    public void setPackageDetails(String packageDetails) {
        this.packageDetails = packageDetails;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
