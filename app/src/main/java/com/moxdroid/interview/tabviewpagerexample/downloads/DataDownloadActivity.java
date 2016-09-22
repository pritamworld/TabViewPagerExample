/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.downloads;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import com.adesa.interview.tabviewpagerexample.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moxdroid.interview.tabviewpagerexample.BaseActivity;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * The type Data download activity.
 */
public class DataDownloadActivity extends BaseActivity {

    private final String TAG = DataDownloadActivity.class.getSimpleName();
    /**
     * The Filter.
     */
    IntentFilter filter;
    /**
     * The My web view.
     */
    WebView myWebView;
    /**
     * The Add button.
     */
    Button addButton;
    /**
     * The My text view.
     */
    TextView myTextView;
    /**
     * The Progress dialog.
     */
    ProgressDialog progressDialog;
    private WebRequestReceiver receiver;
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_download);


        myWebView = (WebView) findViewById(R.id.myWebView);
        myTextView = (TextView) findViewById(R.id.response);
        addButton = (Button) findViewById(R.id.sendRequest);

        progressDialog = new ProgressDialog(this);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(false);

        /*mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        mFirebaseAnalytics.setAnalyticsCollectionEnabled(true);
        mFirebaseAnalytics.setMinimumSessionDuration(20000);*/

        myWebView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                progressDialog.setMessage("Loading WebView... " + (progress) + "%");
                //progressDialog.setProgress(progress * 100);

                if (progress == 100)
                    progressDialog.hide();
            }
        });
        myWebView.getSettings().setJavaScriptEnabled(true);


        filter = new IntentFilter(WebRequestReceiver.PROCESS_RESPONSE);
        filter.addCategory(Intent.CATEGORY_DEFAULT);
        receiver = new WebRequestReceiver();

        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                progressDialog.show();

                //FeedbackManager.showFeedbackActivity(DataDownloadActivity.this);

                //------ FireBase Events ------------
                /*Bundle bundle = new Bundle();
                String id = "1year";
                String name = "Annual membership subscription";
                bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
                bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
                bundle.putString(FirebaseAnalytics.Param.CURRENCY, "EUR");
                bundle.putString(FirebaseAnalytics.Param.PRICE, "299.00");
                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);*/
                //------------------------------
                //Start DataDownloadService
                DataDownloadIntentService.startDataDownload(DataDownloadActivity.this, "https://www.amazon.com");
                //DataDownloadIntentService.startDataDownload(DataDownloadActivity.this, "http://www.ebay.com");
                //DataDownloadIntentService.startDataDownload(DataDownloadActivity.this, "http://www.yahoo.com");

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        registerReceiver(receiver, filter);

    }

    @Override
    public void onStop() {
        super.onStop();
        progressDialog.hide();
        unregisterReceiver(receiver);

    }


    /**
     * The type Web request receiver.
     */
    public class WebRequestReceiver extends BroadcastReceiver {
        /**
         * The constant PROCESS_RESPONSE.
         */
        public static final String PROCESS_RESPONSE = "com.adesa.interview.tabviewpagerexample.intent.action.PROCESS_RESPONSE";

        /**
         * Instantiates a new Web request receiver.
         */
        public WebRequestReceiver() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            String responseString = intent.getStringExtra(DataDownloadIntentService.RESPONSE_STRING);
            String responseMessage = intent.getStringExtra(DataDownloadIntentService.RESPONSE_MESSAGE);

            myTextView.setText(responseString);


            //myWebView.loadData(responseMessage,"text/html","UTF-8");
            try {
                myWebView.loadData(URLEncoder.encode(responseMessage, "utf-8").replaceAll("\\+", " "), "text/html", "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            //progressDialog.hide();
        }
    }
}
