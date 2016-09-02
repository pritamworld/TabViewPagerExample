/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample.volleytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.adesa.interview.tabviewpagerexample.R;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

/**
 * The type Image loading activity.
 */
public class ImageLoadingActivity extends AppCompatActivity {

    private NetworkImageView mNetworkImageView;
    private ImageLoader mImageLoader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loading);

        mNetworkImageView = (NetworkImageView) findViewById(R.id.networkImageView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Instantiate the RequestQueue.
        mImageLoader = CustomVolleyRequestQueue.getInstance(this.getApplicationContext())
                .getImageLoader();
        //Image URL - This can point to any image file supported by Android
        final String url = "http://goo.gl/0rkaBz";
        mImageLoader.get(url, ImageLoader.getImageListener(mNetworkImageView,
                R.mipmap.ic_launcher, android.R.drawable
                        .ic_dialog_alert));
        mNetworkImageView.setImageUrl(url, mImageLoader);
    }
}
