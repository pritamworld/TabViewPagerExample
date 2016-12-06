/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.python;

/**
 * Created by pritesh.patel on 2016-10-21, 1:23 PM.
 * ADESA, Canada
 */

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Android RestTask (REST) from the Android Recipes book.
 */
public class RestTask extends AsyncTask<HttpUriRequest, Void, String>
{
    private static final String TAG = "AARestTask";
    public static final String HTTP_RESPONSE = "httpResponse";

    private Context mContext;
    private HttpClient mClient;
    private String mAction;

    public RestTask(Context context, String action)
    {
        mContext = context;
        mAction = action;
        mClient = new DefaultHttpClient();
    }

    public RestTask(Context context, String action, HttpClient client)
    {
        mContext = context;
        mAction = action;
        mClient = client;
    }

    @Override
    protected String doInBackground(HttpUriRequest... params)
    {
        try
        {
            HttpUriRequest request = params[0];
            HttpResponse serverResponse = mClient.execute(request);
            BasicResponseHandler handler = new BasicResponseHandler();
            return handler.handleResponse(serverResponse);
        }
        catch (Exception e)
        {
            // TODO handle this properly
            e.printStackTrace();
            return "";
        }
    }

    @Override
    protected void onPostExecute(String result)
    {
        Log.i(TAG, "RESULT = " + result);
        Intent intent = new Intent(mAction);
        intent.putExtra(HTTP_RESPONSE, result);

        // broadcast the completion
        mContext.sendBroadcast(intent);
    }

}

