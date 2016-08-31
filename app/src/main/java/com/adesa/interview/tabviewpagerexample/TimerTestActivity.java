package com.adesa.interview.tabviewpagerexample;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimerTestActivity extends AppCompatActivity {

    private  final static String TAG = TimerTestActivity.class.getSimpleName();
    private Handler handler;
    private Runnable runable;
    private TextView txtTimer;
    boolean isTimerRunning;
    SimpleDateFormat format;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_test);

        txtTimer = (TextView)findViewById(R.id.txtTimer);

        isTimerRunning = true;
        String currentDate;
        

        format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date dt = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, 2);
        //currentDate = format.format(new java.util.Date());
        currentDate = format.format(cal.getTime());
        //Log.d(TAG,"Start Date : " + currentDate);
        Log.d(TAG,"Start Date : " + dt.toString());
        txtTimer.setText(currentDate);
        updateData(txtTimer,currentDate);


    }
    private void updateData(final TextView tvCancelBuyTimer, final String date) {
        handler = new Handler();
        runable = new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        handler.removeCallbacks(runable);
                        handler = new Handler();
                        handler.postDelayed(runable, 1000);

                        String timeLeft = getDateTime(date);

                        if (timeLeft.equals("timesUp")) {
                            tvCancelBuyTimer.setText(0 + "m:" + 00 + "s");
                            Log.d(TAG,"Time End : 0 + m: + 00 + s");
                        } else {
                            tvCancelBuyTimer.setText(timeLeft);
                            Log.d(TAG,"Time : " + timeLeft);
                        }
                    }
                });
                if (isTimerRunning) {
                    handler.postDelayed(runable, 1000);
                } else {
                    handler.removeCallbacks(runable);
                }
            }
        };
        handler.postDelayed(runable, 1000);
    }

    /**
     * get the time and date
     */
    private String getDateTime(String dateStop) {

        String timeLeft = "";
        java.util.Date d1 = null;
        java.util.Date d2 = null;
        try {
            d1 = format.parse(format.format(new Date()));
            d2 = format.parse(dateStop);
            Log.d(TAG,"End Date : " + d1);
            long diff = d2.getTime() - d1.getTime();
            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);
            if (diffMinutes <= 0) {
                if (diffSeconds <= 0) {
                    timeLeft = "timesUp";
                    //isTimerRunning=false;
                }
            }
            if (!timeLeft.equals("timesUp"))
                timeLeft = String.format("%02d", diffMinutes) + "m:" + String.format("%02d", diffSeconds) + "sec";

        } catch (Exception e) {
            e.printStackTrace();
            timeLeft = "timesUp";
        }
        return timeLeft;
    }
}
