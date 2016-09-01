package com.adesa.interview.tabviewpagerexample.multitasking;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.adesa.interview.tabviewpagerexample.R;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class PeriodicHandlerActivity extends AppCompatActivity {
    private final static String TAG = PeriodicHandlerActivity.class.getSimpleName();
    // Create the Handler object (on the main thread by default)
    Handler handler = new Handler();

    EventBus eventBus;
    @InjectView(R.id.btnStart)
    Button btnStart;
    @InjectView(R.id.btnSendEvent)
    Button btnSendEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_handler);
        ButterKnife.inject(this);

        eventBus = EventBus.getDefault();
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
        eventBus.register(this);

    }

    @Override
    public void onPause() {
        super.onPause();
        handler.removeCallbacks(runnableCode);
        Log.d("STOP", "Called on main thread");
        eventBus.unregister(this);
    }


    @Subscribe()
    public void onMessage(MyBusEvent event) {
        Log.d(TAG + " - EVENT-BUS", event.getEventDescription());
    }


    @OnClick({R.id.btnStart, R.id.btnSendEvent, R.id.btnSendStickyEvent})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnStart:
                Intent intent = new Intent(this, HandlerExampleActivity.class);
                startActivity(intent);
                break;
            case R.id.btnSendEvent:
                eventBus.post(new MyBusEvent(1,"Event from Main-to-Main"));
                break;
            case R.id.btnSendStickyEvent:
                eventBus.postSticky(new MyBusEvent(1,"Event from Main-to-Sticky"));
                break;
        }
    }
}
