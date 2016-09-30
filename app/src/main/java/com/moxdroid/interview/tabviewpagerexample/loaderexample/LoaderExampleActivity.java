/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.loaderexample;

import android.app.ProgressDialog;
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
import android.widget.ListView;

import com.moxdroid.interview.tabviewpagerexample.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoaderExampleActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Article>>
{
    private final static String TAG = LoaderExampleActivity.class.getName();
    ArticleAdapter articleAdapter;
    ProgressDialog pd;

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

        articleAdapter = new ArticleAdapter(this, new ArrayList<Article>());
        ListView employeeListView = (ListView) findViewById(R.id.lstArticles);
        employeeListView.setAdapter(articleAdapter);

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

        pd = new ProgressDialog(this);
        pd.setTitle("Loading...");
        pd.setCancelable(false);

        getSupportLoaderManager().initLoader(1, null, this).forceLoad();
        getSupportLoaderManager().initLoader(2, null, this).forceLoad();
        getSupportLoaderManager().initLoader(3, null, this).forceLoad();
        getSupportLoaderManager().initLoader(4, null, this).forceLoad();

    }

    @Override
    public Loader<List<Article>> onCreateLoader(int id, Bundle args)
    {
        pd.show();
        return new MyAsyncTaskLoader(LoaderExampleActivity.this);
    }

    @Override
    public void onLoadFinished(Loader<List<Article>> loader, List<Article> data)
    {
        articleAdapter.setArticleList(data);
        pd.hide();
    }

    @Override
    public void onLoaderReset(Loader<List<Article>> loader)
    {
        articleAdapter.setArticleList(new ArrayList<Article>());
    }

    private static class MyAsyncTaskLoader extends AsyncTaskLoader<List<Article>>
    {
        public MyAsyncTaskLoader(Context context)
        {
            super(context);
        }

        @Override
        public List<Article> loadInBackground()
        {
            List<Article> articleList = new ArrayList<>();
            String str = getData("http://hmkcode.appspot.com/rest/controller/get.json");
            Log.d(TAG, "onCreateLoader: " + str);
            try
            {
                JSONObject jsonObject = new JSONObject(str);
                JSONArray jsonArray = jsonObject.getJSONArray("articleList");
                for (int i = 0; i < jsonArray.length(); i++)
                {
                    JSONObject article = jsonArray.getJSONObject(i);
                    Article myArticle = new Article();
                    myArticle.setTitle(article.getString("title"));
                    myArticle.setUrl(article.getString("url"));
                    articleList.add(myArticle);
                }
                //Thread.sleep(5000);
            } catch (JSONException e)
            {
                e.printStackTrace();
            }
            return articleList;
        }
    }
}
