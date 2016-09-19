/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample;


import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.moxdroid.interview.tabviewpagerexample.HelloAndroid;
import com.robotium.solo.Solo;

public class HelloAndroidTest extends ActivityInstrumentationTestCase2<HelloAndroid> {

    private HelloAndroid mActivity;
    private TextView mView;
    private String resourceString;
    private Solo solo;

    public HelloAndroidTest() {
        // TODO Auto-generated constructor stub
        super("com.adesa.interview.tabviewpagerexample", HelloAndroid.class);
    }

    @Override
    protected void setUp() throws Exception {
        // TODO Auto-generated method stub
        //	super.setUp();

        mActivity = this.getActivity();
        solo = new Solo(getInstrumentation(), getActivity());
        mView = (TextView) mActivity.findViewById(com.adesa.interview.tabviewpagerexample.R.id.textview2);
        resourceString = mActivity.getString(com.adesa.interview.tabviewpagerexample.R.string.hello_world);

    }

    @Override
    protected void tearDown() throws Exception {
        // TODO Auto-generated method stub
        //super.tearDown();
        solo.finishOpenedActivities();
    }

    public void testPrecondition() {
        assertNotNull(mView);
    }

    /* test Target application contains a text display "Hello World!"*/
    public void testSearchText() {
        assertEquals(resourceString, (String) mView.getText());
    }

    /* test HelloAndroid Activity on target application is exist*/
    public void testCurrentActivity() throws Exception {
        solo.assertCurrentActivity("wrong activity", HelloAndroid.class);
    }

    /* test Application UI contains "Start" button */
    /* send event click button to target application */
    public void testSearchButton() throws Exception {
        boolean found = solo.searchButton("Start");
        solo.clickOnButton("Start");
        assertTrue(found);
    }


}
