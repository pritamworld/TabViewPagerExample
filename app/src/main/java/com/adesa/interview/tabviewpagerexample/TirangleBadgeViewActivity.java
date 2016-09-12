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

        //txtScrollingText.setSelected(true);
        //txtScrollingText.requestFocus();

        /*txtScrollingText.setText("welcome_to_android_programming_welcome_to_ios_programming_welcome_to_blackberry_programming_welcome_to_net_programming_welcome_to_java_programming");
        txtScrollingText.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        txtScrollingText.setSingleLine(true);
        txtScrollingText.setMarqueeRepeatLimit(5);
        txtScrollingText.setSelected(true);*/
    }
}
