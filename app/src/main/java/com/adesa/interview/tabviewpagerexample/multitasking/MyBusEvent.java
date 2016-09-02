/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample.multitasking;

import org.apache.commons.lang3.text.StrBuilder;

/**
 * Created by pritesh.patel on 2016-09-01.
 */
public class MyBusEvent {
    private int eventCode;

    /**
     * Instantiates a new My bus event.
     *
     * @param eventCode        the event code
     * @param eventDescription the event description
     */
    public MyBusEvent(int eventCode, String eventDescription) {
        this.eventCode = eventCode;
        this.eventDescription = eventDescription;
    }

    /**
     * Gets event code.
     *
     * @return the event code
     */
    public int getEventCode() {
        return eventCode;
    }

    /**
     * Sets event code.
     *
     * @param eventCode the event code
     */
    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    /**
     * Gets event description.
     *
     * @return the event description
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Sets event description.
     *
     * @param eventDescription the event description
     */
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    private String eventDescription;

}
