/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.utils;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

import org.apache.http.conn.util.InetAddressUtils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * Created by pritesh.patel on 16-08-31.
 */
public class Utils {
    /**
     * Gets device ip address.
     *
     * @param useIPv4 the use i pv 4
     * @return the device ip address
     */

    public static String getDeviceIPAddress(boolean useIPv4) {
        try {
            List<NetworkInterface> networkInterfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface networkInterface : networkInterfaces) {
                List<InetAddress> inetAddresses = Collections.list(networkInterface.getInetAddresses());
                for (InetAddress inetAddress : inetAddresses) {
                    if (!inetAddress.isLoopbackAddress()) {
                        String sAddr = inetAddress.getHostAddress().toUpperCase();
                        boolean isIPv4 = InetAddressUtils.isIPv4Address(sAddr);
                        if (useIPv4) {
                            if (isIPv4)
                                return sAddr;
                        } else {
                            if (!isIPv4) {
                                // drop ip6 port suffix
                                int delim = sAddr.indexOf('%');
                                return delim < 0 ? sAddr : sAddr.substring(0, delim);
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }

    /**
     * Gets random key.
     *
     * @return the random key
     */
    public static String getRandomKey() {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        byte seed[] = random.generateSeed(20);

        return new String(seed);

    }

    /**
     * Gets secret key.
     *
     * @return the secret key
     */
    public static SecretKey getSecretKey() {

        KeyGenerator keyGen = null;
        SecretKey secretKey = null;
        try {
            keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(256);
            secretKey = keyGen.generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return secretKey;
    }

    /**
     * Gets android device id.
     *
     * @param context the context
     * @return the android device id
     */
    public static String getAndroidDeviceId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    /**
     * Gets android device serialnumber.
     *
     * @return the android device serialnumber
     */
    public static String getAndroidDeviceSerialnumber() {
        return Build.SERIAL;
    }

    public static void numberFormattor() {
        NumberFormat formatter;
        String number;

        // 0 --> a digit or 0 if no digit present
        formatter = new DecimalFormat("00000");
        number = formatter.format(-1234.567);
        Log.d("Number 1: ", number); //-01235

        formatter = new DecimalFormat("0000.000");
        number = formatter.format(-1234.567);
        Log.d("Number 2: ", number); //-1234.567

        // # --> a digit or nothing if no digit present
        formatter = new DecimalFormat("##");
        number = formatter.format(-1234.567);
        Log.d("Number 3: ", number); //-1235

        formatter = new DecimalFormat("##00");
        number = formatter.format(0);
        Log.d("Number 4: ", number); //00

        // . --> the decimal point
        formatter = new DecimalFormat(".00");
        number = formatter.format(-0.123);
        Log.d("Number 5: ", number); //-.12

        formatter = new DecimalFormat("0.00");
        number = formatter.format(-0.123);
        Log.d("Number 6: ", number); //-0.12

        formatter = new DecimalFormat("#.#");
        number = formatter.format(-1234.567);
        Log.d("Number 7: ", number); //-1234.6

        formatter = new DecimalFormat("#.######");
        number = formatter.format(-1234.567);
        Log.d("Number 8: ", number); //-1234.567

        formatter = new DecimalFormat(".######");
        number = formatter.format(-1234.567);
        Log.d("Number 9: ", number); //-1234.567

        formatter = new DecimalFormat("#.000000");
        number = formatter.format(-1234.567);
        Log.d("Number 10: ", number); //-1234.567000

        // , --> used to group numbers
        formatter = new DecimalFormat("#,###,###");
        number = formatter.format(-1234.567);
        Log.d("Number 11: ", number); //-1,235

        number = formatter.format(-1234567.890);
        Log.d("Number 12: ", number); //-1,234,568

        // '--> used to quote literal symbols
        formatter = new DecimalFormat("'#'#");
        number = formatter.format(-1234.567);
        Log.d("Number 13: ", number); //-#1235

        formatter = new DecimalFormat("'text'#");
        number = formatter.format(-1234.567);
        Log.d("Number 14: ", number); //-text1235
    }
}
