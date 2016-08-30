package com.adesa.interview.tabviewpagerexample.exampleloopj;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.BinaryHttpResponseHandler;
import com.loopj.android.http.FileAsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.SaxAsyncHttpResponseHandler;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import cz.msebera.android.httpclient.conn.ssl.SSLSocketFactory;

/**
 * Created by Interview on 2016-08-16.
 */
public class AdesaNetworkCall {
    private static final String BASE_URL = "https://toyotamobileservice.stage.adesa.com/TDDMobileIntegrationService/";

    private static AsyncHttpClient client;
    private static AdesaNetworkCall adesaNetworkCall;

    /* A private Constructor prevents any other
    * class from instantiating.
    */
    private AdesaNetworkCall(){ }

    /* Static 'instance' method */
    public static AdesaNetworkCall getInstance( ) {
        if(adesaNetworkCall == null) {
            adesaNetworkCall = new AdesaNetworkCall();
            client = new AsyncHttpClient();
            //getSslContext();
        }
        return adesaNetworkCall;
    }

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {

        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void get(String url, RequestParams params, JsonHttpResponseHandler responseHandler) {

        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void get(String url, RequestParams params, BinaryHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void get(String url, RequestParams params, FileAsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void get(String url, RequestParams params, SaxAsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, JsonHttpResponseHandler responseHandler) {

        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

    private static void getSslContext() {

        TrustManager[] byPassTrustManagers = new TrustManager[] { new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }

            public void checkClientTrusted(X509Certificate[] chain, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] chain, String authType) {
            }
        } };

        SSLContext sslContext=null;

        try {
            sslContext = SSLContext.getInstance("TSL");
            sslContext.init(null, byPassTrustManagers, new SecureRandom());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }


        client.setSSLSocketFactory(
                new SSLSocketFactory(sslContext,
                        SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER));
        //return sslContext;

       /* KeyStore trustStore = null;
        try {
            trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            trustStore.load(null, null);
            MySSLSocketFactory sf = new MySSLSocketFactory(trustStore);
            sf.setHostnameVerifier(MySSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

            client.setSSLSocketFactory(sf);
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CertificateException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnrecoverableKeyException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }*/

    }

}
