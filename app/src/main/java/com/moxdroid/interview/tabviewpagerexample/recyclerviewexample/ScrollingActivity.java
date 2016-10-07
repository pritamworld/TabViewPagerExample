/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.moxdroid.interview.tabviewpagerexample.R;

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity
{
    private final String android_version_names[] = {
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jelly Bean",
            "KitKat",
            "Lollipop",
            "Marshmallow"
    };

    private final String android_image_urls[] = {
            "http://api.learn2crack.com/android/images/donut.png",
            "http://api.learn2crack.com/android/images/eclair.png",
            "http://api.learn2crack.com/android/images/froyo.png",
            "http://api.learn2crack.com/android/images/ginger.png",
            "http://api.learn2crack.com/android/images/honey.png",
            "http://api.learn2crack.com/android/images/icecream.png",
            "http://api.learn2crack.com/android/images/jellybean.png",
            "http://api.learn2crack.com/android/images/kitkat.png",
            "http://api.learn2crack.com/android/images/lollipop.png",
            "http://api.learn2crack.com/android/images/marshmallow.png"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        initViews();


        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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
        });*/
    }

    private void initViews()
    {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.card_recycler_view1);
        recyclerView.setHasFixedSize(true);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<AndroidVersion> androidVersions = prepareData();
        DataAdapter adapter = new DataAdapter(getApplicationContext(), androidVersions);
        recyclerView.setAdapter(adapter);

        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.card_recycler_view2);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        ArrayList<AndroidVersion> androidVersions2 = prepareData();
        DataAdapter adapter2 = new DataAdapter(getApplicationContext(), androidVersions2);
        recyclerView2.setAdapter(adapter2);

        RecyclerView recyclerView3 = (RecyclerView) findViewById(R.id.card_recycler_view3);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager3 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(layoutManager3);
        ArrayList<AndroidVersion> androidVersions3 = prepareData();
        DataAdapter adapter3 = new DataAdapter(getApplicationContext(), androidVersions3);
        recyclerView3.setAdapter(adapter3);

        RecyclerView recyclerView4 = (RecyclerView) findViewById(R.id.card_recycler_view4);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager4 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView4.setLayoutManager(layoutManager4);
        ArrayList<AndroidVersion> androidVersions4 = prepareData();
        DataAdapter adapter4 = new DataAdapter(getApplicationContext(), androidVersions4);
        recyclerView4.setAdapter(adapter4);

        RecyclerView recyclerView5 = (RecyclerView) findViewById(R.id.card_recycler_view5);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager5 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView5.setLayoutManager(layoutManager5);
        ArrayList<AndroidVersion> androidVersions5 = prepareData();
        DataAdapter adapter5 = new DataAdapter(getApplicationContext(), androidVersions5);
        recyclerView5.setAdapter(adapter5);
    }

    private ArrayList<AndroidVersion> prepareData()
    {

        ArrayList<AndroidVersion> android_version = new ArrayList<>();
        for (int i = 0; i < android_version_names.length; i++)
        {
            AndroidVersion androidVersion = new AndroidVersion();
            androidVersion.setAndroid_version_name(android_version_names[i]);
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }
}
