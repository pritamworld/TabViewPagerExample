/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class TowerOfHanoiActivity extends AppCompatActivity
{
    static int count;
    int NO_OF_DISK = 4;
    String steps;
    ListView lstSteps;
    EditText edtNoOfDisk;
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayListSteps;
    private String TAG = TowerOfHanoiActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tower_of_hanoi);
        lstSteps = (ListView) findViewById(R.id.lstSteps);
        edtNoOfDisk = (EditText) findViewById(R.id.edtNumberOfDisk);

    }

    private String towerOfHanoi(int disk, int source, int dest, int aux)
    {
        if (disk == 1)
        {
            count++;
            //Log.d(TAG, "[" + count + "] Move Disk " + disk + " from " + source + " to " + dest);
            steps += "\n[" + count + "] Move Disk " + disk + " from " + source + " to " + dest;
            arrayListSteps.add("[ " + count + " ] Move Disk " + disk + " from " + source + " to " + dest);
        } else
        {
            towerOfHanoi(disk - 1, source, aux, dest);
            count++;
            //Log.d(TAG, "[" + count + "] Move Disk " + disk + " from " + source + " to " + dest);
            steps += "\n[" + count + "] Move Disk " + disk + " from " + source + " to " + dest;
            arrayListSteps.add("[ " + count + " ] Move Disk " + disk + " from " + source + " to " + dest);
            towerOfHanoi(disk - 1, aux, dest, source);
        }

        return steps;
    }

    public void onClick(View v)
    {

        count = 0;
        if (TextUtils.isEmpty(edtNoOfDisk.getText().toString().trim()))
        {
            edtNoOfDisk.setError("Enter Number of disk");
        } else
        {
            arrayListSteps = new ArrayList<>();
            NO_OF_DISK = Integer.parseInt(edtNoOfDisk.getText().toString());
            if (NO_OF_DISK == 0)
                edtNoOfDisk.setError("Enter Number > 0");
            else if (NO_OF_DISK > 10)
                edtNoOfDisk.setError("Enter Number <= 10");
            else
            {
                steps = towerOfHanoi(NO_OF_DISK, 1, 2, 3);
                //Log.d(TAG, "onCreate: " + steps);

                arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayListSteps);
                lstSteps.setAdapter(arrayAdapter);
            }
        }
    }
}
