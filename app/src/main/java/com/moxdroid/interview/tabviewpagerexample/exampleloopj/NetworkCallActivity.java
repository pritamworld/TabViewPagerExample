/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.exampleloopj;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Button;

import com.adesa.interview.tabviewpagerexample.R;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.moxdroid.interview.tabviewpagerexample.exampleloopj.models.ConditionReport;

import org.json.JSONArray;
import org.json.JSONObject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cz.msebera.android.httpclient.Header;

/**
 * The type Network call activity.
 */
public class NetworkCallActivity extends AppCompatActivity {


    /**
     * The Tag.
     */
    final String TAG = NetworkCallActivity.class.getCanonicalName();
    /**
     * The Btn call.
     */
    @InjectView(R.id.btnCall)
    Button btnCall;
    /**
     * The Progress dialog.
     */
    ProgressDialog progressDialog;
    /**
     * The Web view.
     */
    @InjectView(R.id.webView)
    WebView webView;
    /**
     * The Preferences manager.
     */
    PreferencesManager preferencesManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_call);
        ButterKnife.inject(this);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");

        PreferencesManager.initializeInstance(this);
        preferencesManager = PreferencesManager.getInstance();



    }

    /**
     * On click.
     */
    @OnClick(R.id.btnCall)
    public void onClick() {
        //setNetworkCall();
        //setANetworkCall();
        setBNetworkCall();
    }

    private void setBNetworkCall() {
        progressDialog.show();
        /*RequestParams requestParams = new RequestParams();
        requestParams.add("userId","561062");
        requestParams.add("dealerId","16696");
        requestParams.add("startIndex","0");
        requestParams.add("userStateId","43");
        requestParams.add("maxResults","40");
        requestParams.add("timeZone","America/Chicago");
        requestParams.add("longitude","-86.1181");
        requestParams.add("latitude","39.9783");
        requestParams.add("searchKey","2012");
        requestParams.add("dealership","TBSG");
        requestParams.add("datePattern","MM/dd/yyyy");*/
        RequestParams requestParams = new RequestParams();
        requestParams.add("userId","617132");
        requestParams.add("dealerId","15348");
        requestParams.add("inventoryId","5272032");

        //?userId=617132&dealerId=15348&inventoryId=5272032
        AdesaNetworkCall.getInstance().get("conditionReport/conditionReportDetails",requestParams,new JsonHttpResponseHandler(){

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
            }


            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject jsonObject) {
                // If the response is JSONObject instead of expected JSONArray
                Gson gson = new Gson();
                if(jsonObject!=null) {
                    Log.d(TAG, jsonObject.toString());
                    ConditionReport conditionReport = gson.fromJson(jsonObject.toString(), ConditionReport.class);
                    if(conditionReport !=null){
                        Log.d(TAG,conditionReport.getMake());
                        Log.d(TAG,conditionReport.toString());
                    }else{
                        Log.d(TAG,"Error in GSON...");
                    }

                }

                /* String message = null;
                try {
                    message = jsonObject.getString("message");
                    if (message.equalsIgnoreCase("Login success.")){
                        Toast.makeText(getApplicationContext(),"Login Success",Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }*/
                progressDialog.hide();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray jsonArray) {
                // Pull out the first event on the public timeline
                /*JSONObject firstEvent = null;
                try {
                    firstEvent = (JSONObject) timeline.get(0);
                    String tweetText = firstEvent.getString("text");
                    // Do something with the response
                    System.out.println(tweetText);
                } catch (JSONException e) {
                    e.printStackTrace();
                }*/
                Log.d(TAG,String.valueOf(statusCode));
                progressDialog.hide();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable error, JSONObject jsonObject) {
                //super.onFailure( statusCode, headers,  error,  jsonObject);
                progressDialog.hide();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable error, JSONArray jsonArray) {
                //super.onFailure( statusCode, headers,  error,  jsonArray);
                progressDialog.hide();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                super.onFailure(statusCode, headers, responseString, throwable);
                Log.d(TAG, ""+statusCode);
                Log.d(TAG, "" + throwable);
            }



            @Override
            public void onRetry(int retryNo) {
                // called when request is retried
                progressDialog.setMessage("Retry loading... " + retryNo);
                if(retryNo==3)
                    progressDialog.hide();
            }
        });
    }

    private void setNetworkCall() {
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        asyncHttpClient.get("https://www.google.com", new AsyncHttpResponseHandler() {
            @Override
            public void onStart() {
                // called before request is started
                progressDialog.show();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                String str = new String(responseBody);
                webView.loadData(str,"text/html","utf-8");
                Log.d(TAG, str);
                progressDialog.hide();

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                progressDialog.hide();
            }

            @Override
            public void onRetry(int retryNo) {
                // called when request is retried
            }

        });
    }

    private void setANetworkCall() {
        progressDialog.show();
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();

        RequestParams requestParams = new RequestParams();

        requestParams.add("userId","561062");
        requestParams.add("dealerId","16696");
        requestParams.add("startIndex","0");
        requestParams.add("userStateId","43");
        requestParams.add("maxResults","40");
        requestParams.add("timeZone","America/Chicago");
        requestParams.add("longitude","-86.1181");
        requestParams.add("latitude","39.9783");
        requestParams.add("searchKey","2012");
        requestParams.add("dealership","TBSG");
        requestParams.add("datePattern","MM/dd/yyyy");
        asyncHttpClient.post("https://toyotamobileservice.dev.adesa.com/TDDMobileIntegrationService/search/quickSearch", requestParams, new AsyncHttpResponseHandler() {
            @Override
            public void onStart() {
                // called before request is started

            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                //String str = new String(responseBody);

                Log.d(TAG, String.valueOf(statusCode));
                progressDialog.hide();

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

                progressDialog.hide();
            }

            @Override
            public void onRetry(int retryNo) {
                // called when request is retried
            }

        });
    }
}
