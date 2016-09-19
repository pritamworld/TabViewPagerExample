/*
 * Copyright (c) 2016. Pritesh Patel
 */

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
import com.adesa.interview.tabviewpagerexample.utils.Utils;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.text.StrBuilder;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * The type Handler example activity.
 */
public class HandlerExampleActivity extends Activity {

    private final static String TAG = HandlerExampleActivity.class.getSimpleName();
    private static ProgressDialog progressDialog;
    private static Bitmap downloadBitmap;
    private static Handler handler;
    /**
     * The Txt message.
     */
    @InjectView(R.id.txtMessage)
    TextView txtMessage;
    /**
     * The Progress bar.
     */
    @InjectView(R.id.progressBar)
    ProgressBar progressBar;
    /**
     * The Image view bitmap.
     */
    @InjectView(R.id.imageViewBitmap)
    ImageView imageViewBitmap;
    private Thread downloadThread;
    private MyRunnableThread myRunnableThread;

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

    static private String openWebSite(String url) throws IOException {

        URL urlWebLink = new URL("https://wikipedia.org");
        URLConnection urlConnection = urlWebLink.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        byte[] bytes = IOUtils.toByteArray(inputStream);
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append(new String(bytes));
        return strBuilder.build();

    }

    static private String openCertifiedWebSite(String url) throws IOException {

        URL urlWebLink = new URL("https://certs.cac.washington.edu/CAtest/");
        HttpsURLConnection urlConnection = (HttpsURLConnection) urlWebLink.openConnection();
        SSLContext context = getTrustedCertificate();
        if (context != null) {
            urlConnection.setSSLSocketFactory(context.getSocketFactory());
            InputStream inputStream = urlConnection.getInputStream();
            byte[] bytes = IOUtils.toByteArray(inputStream);
            StrBuilder strBuilder = new StrBuilder();
            strBuilder.append(new String(bytes));
            return strBuilder.build();
        } else return null;
    }

    /**
     * Gets server ssl.
     *
     * @param url the url
     */
    public static void getServerSSL(String url) {
        SSLSocket sslsocket = null;
        int port = 443;
        SSLSocketFactory sslsocketfactory = (SSLSocketFactory) SSLSocketFactory.getDefault();

        try {
            sslsocket = (SSLSocket) sslsocketfactory.createSocket(url, port);
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        InputStream inputstream = null;
        try {
            inputstream = sslsocket.getInputStream();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader);


        OutputStream outputstream = null;
        try {
            outputstream = sslsocket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(outputstream);
        BufferedWriter bufferedwriter = new BufferedWriter(outputstreamwriter);

        sslsocket.addHandshakeCompletedListener(new HandshakeCompletedListener() {

            @Override
            public void handshakeCompleted(HandshakeCompletedEvent event) {
                // TODO Auto-generated method stub
                Log.i("test", event.toString());
            }
        });

        try {
            sslsocket.startHandshake();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static private SSLContext getTrustedCertificate() throws IOException {
        //Load CAs from an InputStream
        // (could be from a resource or ByteArrayInputStream or ...)
        InputStream caInput = null;
        SSLContext context = null;
        try {

            CertificateFactory cf = CertificateFactory.getInstance("X.509");
            // From https://www.washington.edu/itconnect/security/ca/load-der.crt
            caInput = new BufferedInputStream(new FileInputStream("load-der.crt"));
            Certificate ca;

            ca = cf.generateCertificate(caInput);
            System.out.println("ca=" + ((X509Certificate) ca).getSubjectDN());
            // Create a KeyStore containing our trusted CAs
            String keyStoreType = KeyStore.getDefaultType();
            KeyStore keyStore = KeyStore.getInstance(keyStoreType);
            keyStore.load(null, null);
            keyStore.setCertificateEntry("ca", ca);

            // Create a TrustManager that trusts the CAs in our KeyStore
            String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
            TrustManagerFactory tmf = TrustManagerFactory.getInstance(tmfAlgorithm);
            tmf.init(keyStore);

            // Create an SSLContext that uses our TrustManager
            context = SSLContext.getInstance("TLS");
            context.init(null, tmf.getTrustManagers(), null);
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        } finally {
            caInput.close();
        }


        return context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_example);
        ButterKnife.inject(this);


        //txtMessage.setText(Utils.getDeviceIPAddress(true));
        //txtMessage.setText(Utils.getRandomKey());
        //txtMessage.setText(Installation.id(this));
        //txtMessage.setText(Utils.getAndroidDeviceId(this));
        txtMessage.setText(Utils.getAndroidDeviceSerialnumber());

        // create a handler to update the UI
        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                //Passing Data
                if (msg.getData() != null) {
                    Bundle bundle = msg.getData();
                    String string = bundle.getString("myKey");
                    txtMessage.setText(string);
                    imageViewBitmap.setImageBitmap(downloadBitmap);
                } else if (msg.what == 0) {
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
            progressDialog = ProgressDialog.show(this, "Download", "Downloading...");
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        //Register EventBus here
        EventBus.getDefault().register(this);
        MyBusEvent stickyEvent = EventBus.getDefault().getStickyEvent(MyBusEvent.class);
        // Better check that an event was actually posted before
        if(stickyEvent != null) {
            // "Consume" the sticky event
            txtMessage.setText("1 : " + stickyEvent.getEventDescription());
            EventBus.getDefault().removeStickyEvent(stickyEvent);
            // Now do something with it
        }else txtMessage.setText("Null Sticky Event");
    }

    @Override
    public void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(this);
    }

    /**
     * On event.
     *
     * @param event the event
     */
    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onEvent(MyBusEvent event) {
        // UI updates must run on MainThread
        txtMessage.setText(event.getEventDescription());
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

    /**
     * Start progress.
     *
     * @param view the view
     */
    public void startProgress(View view) {
        // do something long
        progressBar.setVisibility(View.VISIBLE);
        txtMessage.setText("Starting...");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i <= 1; i++) {
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
                            if (value == 1) {
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
            //String string = openWebSite(null);
            String string = openCertifiedWebSite(null);
            if (string != null)
                Log.d(TAG, string);
            else
                Log.d(TAG, "SSLContext NULL");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * On click.
     *
     * @param view the view
     */
    @OnClick({R.id.btnDownload, R.id.btnReset})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDownload:
                progressDialog = ProgressDialog.show(this, "Download", "Downloading...");

                //Using Extend Thread Class
                //downloadThread = new MyThread();
                //downloadThread.start();

                //Executors.newSingleThreadExecutor().submit(new Runnable());
                //Using implementation of Runnable Interface
                myRunnableThread = new MyRunnableThread();
                downloadThread = new Thread(myRunnableThread);
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

    /**
     * The type My thread.
     */
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

    /**
     * The type My runnable thread.
     */
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
                //handler.sendEmptyMessage(0);
                Message msg = handler.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putString("myKey", "SUCCESS");
                msg.setData(bundle);
                handler.sendMessage(msg);
            } catch (IOException e) {
                e.printStackTrace();
                handler.sendEmptyMessage(1);
            } finally {

            }
        }
    }
}