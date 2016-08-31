package com.adesa.interview.tabviewpagerexample.multitasking;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.adesa.interview.tabviewpagerexample.R;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class HandlerExampleActivity extends Activity {

    private final static String TAG = HandlerExampleActivity.class.getSimpleName();
    private static ProgressDialog progressDialog;
    private static Bitmap downloadBitmap;
    private static Handler handler;
    private Thread downloadThread;
    private MyRunnableThread myRunnableThread;
    @InjectView(R.id.txtMessage)
    TextView txtMessage;
    @InjectView(R.id.progressBar)
    ProgressBar progressBar;
    @InjectView(R.id.imageViewBitmap)
    ImageView imageViewBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_example);
        ButterKnife.inject(this);

        // create a handler to update the UI
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                if (msg.what == 0) {
                    imageViewBitmap.setImageBitmap(downloadBitmap);
                    Log.d(TAG, "Image Found");
                } else if (msg.what == 1) {
                    imageViewBitmap.setImageResource(R.mipmap.ic_launcher);
                    Log.d(TAG, "No Image Found");
                }
                progressDialog.dismiss();
            }

        };

        // get the latest imageView after restart of the application
        Context context = imageViewBitmap.getContext();
        //Log.d(TAG,context.toString());
        // Did we already download the image?
        if (downloadBitmap != null) {
            imageViewBitmap.setImageBitmap(downloadBitmap);
        }

        // check if the thread is already running
        downloadThread = (Thread) getLastNonConfigurationInstance();
        if (downloadThread != null && downloadThread.isAlive()) {
            progressDialog = ProgressDialog.show(this, "Download", "downloading");
        }
    }


    // save the thread
    @Override
    public Object onRetainNonConfigurationInstance() {
        return downloadThread;
    }

    // dismiss progressDialog if activity is destroyed
    @Override
    protected void onDestroy() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
            progressDialog = null;
        }
        super.onDestroy();
    }

    public void startProgress(View view) {
        // do something long
        progressBar.setVisibility(View.VISIBLE);
        txtMessage.setText("Starting...");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i <= 10; i++) {
                    final int value = i;
                    doFakeWork();
                    progressBar.post(new Runnable() {
                        @Override
                        public void run() {
                            txtMessage.setText("Updating...");
                            progressBar.setProgress(value);
                            Log.d(TAG, "1");
                        }
                    });

                    progressBar.post(new Runnable() {
                        @Override
                        public void run() {
                            if (value == 10) {
                                progressBar.setVisibility(View.GONE);
                                txtMessage.setText("Done!!!");
                            } else Log.d(TAG, "2");
                        }
                    });
                }
            }
        };
        new Thread(runnable).start();

    }

    // Simulating something timeconsuming
    private void doFakeWork() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @OnClick({R.id.btnDownload, R.id.btnReset})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDownload:
                progressDialog = ProgressDialog.show(this, "Download", "downloading");

                //Using Extend Thread Class
                //downloadThread = new MyThread();
                //downloadThread.start();

                //Executors.newSingleThreadExecutor().submit(new Runnable());
                //Using implementation of Runnable Interface
                myRunnableThread = new MyRunnableThread();
                downloadThread = new Thread(myRunnableThread) ;
                downloadThread.start();

                break;
            case R.id.btnReset:
                if (downloadBitmap != null) {
                    downloadBitmap = null;
                }
                imageViewBitmap.setImageResource(R.mipmap.ic_launcher);
                break;
        }
    }

    // Utility method to download image from the internet
    static private Bitmap downloadBitmap(String url) throws IOException {

        HttpURLConnection httpURLConnection;
        URL urlImage = new URL(url);
        httpURLConnection = (HttpURLConnection) urlImage.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();

        Bitmap bitmap;
        Log.d(TAG, httpURLConnection.getResponseMessage());
        if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bytes = IOUtils.toByteArray(inputStream);
            bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        } else {
            throw new IOException("Download failed, HTTP response code "
                    + httpURLConnection.getResponseCode()
                    + " - "
                    + httpURLConnection.getResponseMessage());
        }
        return bitmap;
    }

    static public class MyThread extends Thread {
        @Override
        public void run() {
            try {
                // Simulate a slow network
                try {
                    new Thread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                downloadBitmap = downloadBitmap("http://api.androidhive.info/images/sample.jpg");
                // Updates the user interface
                handler.sendEmptyMessage(0);
            } catch (IOException e) {
                e.printStackTrace();
                handler.sendEmptyMessage(1);
            } finally {

            }
        }
    }

    static public class MyRunnableThread implements Runnable {
        @Override
        public void run() {
            // Moves the current Thread into the background
            android.os.Process.setThreadPriority(android.os.Process.THREAD_PRIORITY_BACKGROUND);
            try {
                // Simulate a slow network
                try {
                    new Thread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                downloadBitmap = downloadBitmap("http://api.androidhive.info/images/sample.jpg");
                // Updates the user interface
                handler.sendEmptyMessage(0);
            } catch (IOException e) {
                e.printStackTrace();
                handler.sendEmptyMessage(1);
            } finally {

            }
        }
    }
}