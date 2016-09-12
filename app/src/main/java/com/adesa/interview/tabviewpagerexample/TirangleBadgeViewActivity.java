/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class TirangleBadgeViewActivity extends AppCompatActivity {

    @InjectView(R.id.txtScrollingText)
    TextView txtScrollingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tirangle_badge_view);
        ButterKnife.inject(this);

        txtScrollingText.setSelected(true);
        //txtScrollingText.requestFocus();
    }
}
