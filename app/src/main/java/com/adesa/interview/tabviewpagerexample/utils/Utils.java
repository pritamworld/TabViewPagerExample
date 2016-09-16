/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample.utils;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

import org.apache.http.conn.util.InetAddressUtils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
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

}
