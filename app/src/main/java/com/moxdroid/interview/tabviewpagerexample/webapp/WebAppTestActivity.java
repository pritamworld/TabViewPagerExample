/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.webapp;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.moxdroid.interview.tabviewpagerexample.R;

public class WebAppTestActivity extends AppCompatActivity {

    AssetManager assetManager;
    WebView webViewTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_app_test);

        webViewTest = (WebView) findViewById(R.id.webViewTest);
        WebSettings webSettings = webViewTest.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webViewTest.loadUrl("file:///android_asset/index.html");
        webViewTest.addJavascriptInterface(new WebAppInterface(this), "Android");
    }
}
