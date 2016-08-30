
package com.adesa.interview.tabviewpagerexample.exampleloopj.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ADDEXTINF {

    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("text")
    @Expose
    private Object text;

    /**
     * 
     * @return
     *     The type
     */
    public Object getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(Object type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The text
     */
    public Object getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(Object text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
