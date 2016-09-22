/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.adesa.interview.tabviewpagerexample.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

//Linear Layout Example to Fix TextView on Bottom and ListView on Top
public class LinearLayoutListActivity extends AppCompatActivity {

    String nameArray[];
    ArrayAdapter<String> arrayAdapter;
    @InjectView(R.id.lstData)
    ListView lstData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_list);
        ButterKnife.inject(this);

        nameArray = new String[]{
                "Pritesh", "Jigish", "Moksh", "Krishna", "Vansh", "Mita", "GoCool", "Ami", "Nayan", "Kirit", "Dilip", "Dolly", "Sarda"
        };

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nameArray);
        lstData.setAdapter(arrayAdapter);
    }
}
