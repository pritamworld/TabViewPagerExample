/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.loaderexample;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.moxdroid.interview.tabviewpagerexample.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoaderExampleActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String>
{
    private final static String TAG = LoaderExampleActivity.class.getName();

    public static String getData(String url)
    {
        InputStream inputStream;
        String result = "";
        //URL httpURL;
        try
        {
            //Create URL Object
            URL httpURL = new URL(url);

            // create HttpClient
            HttpURLConnection connection = (HttpURLConnection) httpURL.openConnection();

            // make GET request to the given URL
            connection.setRequestMethod("GET");

            //Establish Connection
            connection.connect();

            //GET InputStream
            inputStream = connection.getInputStream();

            // convert inputstream to string
            if (inputStream != null)
                result = convertInputStreamToString(inputStream);
            else
                result = "Did not work!";

        } catch (Exception e)
        {
            Log.d(TAG, "getData: " + e.getLocalizedMessage());
        }

        return result;
    }

    private static String convertInputStreamToString(InputStream inputStream) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        String result = "";
        while ((line = bufferedReader.readLine()) != null)
            result += line;

        inputStream.close();
        return result;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader_example);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        getSupportLoaderManager().initLoader(1, null, this).forceLoad();
    }

    @Override
    public Loader<String> onCreateLoader(int id, Bundle args)
    {
        return new MyAsyncTaskLoader(LoaderExampleActivity.this);
    }

    @Override
    public void onLoadFinished(Loader<String> loader, String data)
    {
        Log.d(TAG, "onLoadFinished: " + data);
    }

    @Override
    public void onLoaderReset(Loader<String> loader)
    {

    }

    private static class MyAsyncTaskLoader extends AsyncTaskLoader<String>
    {
        public MyAsyncTaskLoader(Context context)
        {
            super(context);
        }

        @Override
        public String loadInBackground()
        {
            String str = getData("http://hmkcode.appspot.com/rest/controller/get.json");
            Log.d(TAG, "onCreateLoader: " + str);
            return str;
        }
    }
}
