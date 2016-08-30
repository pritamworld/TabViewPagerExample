package com.adesa.interview.tabviewpagerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.hockeyapp.android.CrashManager;
import net.hockeyapp.android.UpdateManager;
import net.hockeyapp.android.metrics.MetricsManager;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //add this to your main activity's onCreate()-callback
        MetricsManager.register(this, getApplication());
        checkForUpdates();
    }

    private void checkForUpdates() {
        // Remove this for store builds!
        UpdateManager.register(this);
    }

    private void unregisterManagers() {
        UpdateManager.unregister();
    }

    @Override
    public void onResume() {
        super.onResume();
        // ... your own onResume implementation
        checkForCrashes();
    }

    private void checkForCrashes() {
        CrashManager.register(this);
    }


    @Override
    public void onPause() {
        super.onPause();
        unregisterManagers();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterManagers();
    }
}
