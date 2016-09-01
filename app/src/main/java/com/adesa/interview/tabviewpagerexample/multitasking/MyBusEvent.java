package com.adesa.interview.tabviewpagerexample.multitasking;

import org.apache.commons.lang3.text.StrBuilder;

/**
 * Created by pritesh.patel on 2016-09-01.
 */
public class MyBusEvent {
    private int eventCode;

    public MyBusEvent(int eventCode, String eventDescription) {
        this.eventCode = eventCode;
        this.eventDescription = eventDescription;
    }

    public int getEventCode() {
        return eventCode;
    }

    public void setEventCode(int eventCode) {
        this.eventCode = eventCode;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    private String eventDescription;

}
