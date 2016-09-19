/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.downloads;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class DataDownloadIntentService extends IntentService {
    /**
     * The constant RESPONSE_STRING.
     */
    public static final String RESPONSE_STRING = "myResponse";
    /**
     * The constant RESPONSE_MESSAGE.
     */
    public static final String RESPONSE_MESSAGE = "myResponseMessage";
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_FOO = "com.adesa.interview.tabviewpagerexample.downloads.action.FOO";
    private static final String ACTION_BAZ = "com.adesa.interview.tabviewpagerexample.downloads.action.BAZ";
    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "com.adesa.interview.tabviewpagerexample.downloads.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "com.adesa.interview.tabviewpagerexample.downloads.extra.PARAM2";
    //Download Activity Call
    private static final String ACTION_DOWNLOAD = "com.adesa.interview.tabviewpagerexample.downloads.action.DOWNLOAD";
    private static final String EXTRA_PARAM_URL = "com.adesa.interview.tabviewpagerexample.downloads.extra.PARAM_URL";
    private static final int REGISTRATION_TIMEOUT = 3 * 1000;
    private static final int WAIT_TIMEOUT = 30 * 1000;
    private final String TAG = DataDownloadIntentService.class.getSimpleName();

    /**
     * Instantiates a new Data download intent service.
     */
    public DataDownloadIntentService() {
        super("DataDownloadIntentService");
    }

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @param context the context
     * @param param1  the param 1
     * @param param2  the param 2
     * @see IntentService
     */
// TODO: Customize helper method
    public static void startActionFoo(Context context, String param1, String param2) {
        Intent intent = new Intent(context, DataDownloadIntentService.class);
        intent.setAction(ACTION_FOO);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @param context the context
     * @param param1  the param 1
     * @param param2  the param 2
     * @see IntentService
     */
// TODO: Customize helper method
    public static void startActionBaz(Context context, String param1, String param2) {
        Intent intent = new Intent(context, DataDownloadIntentService.class);
        intent.setAction(ACTION_BAZ);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    /**
     * Start data download.
     *
     * @param context  the context
     * @param paramUrl the param url
     */
    public static void startDataDownload(Context context, String paramUrl) {
        Intent intent = new Intent(context, DataDownloadIntentService.class);
        intent.setAction(ACTION_DOWNLOAD);
        intent.putExtra(EXTRA_PARAM_URL, paramUrl);
        context.startService(intent);
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_FOO.equals(action)) {
                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
                handleActionFoo(param1, param2);
            } else if (ACTION_BAZ.equals(action)) {
                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
                handleActionBaz(param1, param2);
            }else if (ACTION_DOWNLOAD.equals(action)) {
                final String paramUrl = intent.getStringExtra(EXTRA_PARAM_URL);
                handleActionDownload(paramUrl);
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(String param1, String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1, String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void handleActionDownload(String paramUrl) {

        String responseString = paramUrl + " " + DateFormat.format("MM/dd/yy h:mmaa", System.currentTimeMillis());
        String responseMessage = "";
        //SystemClock.sleep(10000); // Wait 10 seconds
        Log.d(TAG,responseString);
        try {
            URL url = new URL(paramUrl);
            HttpsURLConnection httpURLConnection = (HttpsURLConnection)url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            InputStream in = new BufferedInputStream(httpURLConnection.getInputStream());
            //readIt(in,in.);
            responseMessage = convertInputStreamToString(in);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        /* Do some really cool here
        // I am making web request here as an example...
        try {

            HttpClient httpclient = new DefaultHttpClient();
            HttpParams params = httpclient.getParams();

            HttpConnectionParams.setConnectionTimeout(params, REGISTRATION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(params, WAIT_TIMEOUT);
            ConnManagerParams.setTimeout(params, WAIT_TIMEOUT);

            HttpGet httpGet = new HttpGet(paramUrl);
            HttpResponse response = httpclient.execute(httpGet);

            StatusLine statusLine = response.getStatusLine();
            if(statusLine.getStatusCode() == HttpStatus.SC_OK){
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                response.getEntity().writeTo(out);
                out.close();
                responseMessage = out.toString();
            }

            else{
                //Closes the connection.
                Log.d("HTTP1:",statusLine.getReasonPhrase());
                response.getEntity().getContent().close();
                throw new IOException(statusLine.getReasonPhrase());
            }

        } catch (ClientProtocolException e) {
            Log.d("HTTP2:",e.getMessage() );
            responseMessage = e.getMessage();
        } catch (IOException e) {
            Log.d("HTTP3:",e.getMessage() );
            responseMessage = e.getMessage();
        }catch (Exception e) {
            Log.d("HTTP4:",e.getLocalizedMessage() );
            responseMessage = e.getMessage();
        }
        */

        Log.d(TAG,responseMessage);
        Intent broadcastIntent = new Intent();
        broadcastIntent.setAction(DataDownloadActivity.WebRequestReceiver.PROCESS_RESPONSE);
        broadcastIntent.addCategory(Intent.CATEGORY_DEFAULT);
        broadcastIntent.putExtra(RESPONSE_STRING, responseString);
        broadcastIntent.putExtra(RESPONSE_MESSAGE, responseMessage);
        sendBroadcast(broadcastIntent);

        /*
         * Creates a new Intent containing a Uri object
         * BROADCAST_ACTION is a custom Intent action
         */

        /*Intent localIntent =
                new Intent(DataDownloadActivity.WebRequestReceiver.PROCESS_RESPONSE)
                        // Puts the status into the Intent
                        .putExtra(RESPONSE_STRING, responseString)
                        .putExtra(RESPONSE_MESSAGE, responseMessage);
        // Broadcasts the Intent to receivers in this app.
        LocalBroadcastManager.getInstance(this).sendBroadcast(localIntent);*/

    }

    /**
     * Read it string.
     *
     * @param stream the stream
     * @param len    the len
     * @return the string
     * @throws IOException                  the io exception
     * @throws UnsupportedEncodingException the unsupported encoding exception
     */
// Reads an InputStream and converts it to a String.
    public String readIt(InputStream stream, int len) throws IOException {
        Reader reader = null;
        reader = new InputStreamReader(stream, "UTF-8");
        char[] buffer = new char[len];
        reader.read(buffer);
        return new String(buffer);
    }

    private String convertInputStreamToString(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        String line = "";
        String result = "";
        while((line = bufferedReader.readLine()) != null){
            result += line;
            //stringBuilder.append(line);
        }

            /* Close Stream */
        if(null!=inputStream){
            inputStream.close();
        }

        //result = stringBuilder.toString();
        return result;
    }
}
