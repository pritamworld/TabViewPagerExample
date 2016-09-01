package com.adesa.interview.tabviewpagerexample.multitasking;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import com.adesa.interview.tabviewpagerexample.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class PeriodicHandlerActivity extends AppCompatActivity {
    // Create the Handler object (on the main thread by default)
    Handler handler = new Handler();
    @InjectView(R.id.btnStart)
    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_handler);
        ButterKnife.inject(this);
    }

    // Define the code block to be executed
    private Runnable runnableCode = new Runnable() {
        @Override
        public void run() {
            // Do something here on the main thread
            Log.d("Handlers", "Called on main thread");
            // Repeat this the same runnable code block again another 2 seconds
            handler.postDelayed(runnableCode, 2000);
        }
    };

    @Override
    public void onResume() {
        super.onResume();
        // Start the initial runnable task by posting through the handler
        Log.d("START", "Called on main thread");
        handler.post(runnableCode);
    }

    @Override
    public void onPause() {
        super.onPause();
        // Start the initial runnable task by posting through the handler
        handler.removeCallbacks(runnableCode);
        Log.d("STOP", "Called on main thread");
    }

    @OnClick(R.id.btnStart)
    public void onClick() {

        Intent intent = new Intent(this,HandlerExampleActivity.class);
        startActivity(intent);
    }
}
