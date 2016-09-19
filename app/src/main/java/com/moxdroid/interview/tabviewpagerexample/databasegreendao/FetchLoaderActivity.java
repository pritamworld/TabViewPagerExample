/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.databasegreendao;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.adesa.interview.tabviewpagerexample.R;

import java.util.ArrayList;
import java.util.List;


/**
 * The type Fetch loader activity.
 */
public class FetchLoaderActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<User>> {

    /**
     * The Employee list view.
     */
    ListView employeeListView;
    /**
     * The User adapter.
     */
    UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_loader);

        employeeListView = (ListView) findViewById(R.id.employees);
        userAdapter = new UserAdapter(this, new ArrayList<User>());
        employeeListView.setAdapter(userAdapter);
        getSupportLoaderManager().initLoader(1, null, this).forceLoad();
    }


    @Override
    public Loader<List<User>> onCreateLoader(int id, Bundle args) {
        return new CustomLoader(FetchLoaderActivity.this);
    }

    @Override
    public void onLoadFinished(Loader<List<User>> loader, List<User> data) {
        userAdapter.setUsers(data);
    }

    @Override
    public void onLoaderReset(Loader<List<User>> loader) {
        userAdapter.setUsers(new ArrayList<User>());

    }
}
