package com.adesa.interview.tabviewpagerexample.runtimepermission;

import android.Manifest;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.adesa.interview.tabviewpagerexample.R;

public class RunTimePermissionsTestActivity extends RuntimePermissionsActivity {

    private static final int REQUEST_PERMISSIONS = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_time_permission);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();

                RunTimePermissionsTestActivity.super.requestAppPermissions(new
                                String[]{
                                Manifest.permission.READ_CONTACTS,
                                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                                Manifest.permission.CALL_PHONE
                        }, R.string.runtime_permissions_txt
                        , REQUEST_PERMISSIONS);
            }
        });
    }

    @Override
    public void onPermissionsGranted(int requestCode) {
        Toast.makeText(this, "Permissions Received.", Toast.LENGTH_LONG).show();
    }

}
