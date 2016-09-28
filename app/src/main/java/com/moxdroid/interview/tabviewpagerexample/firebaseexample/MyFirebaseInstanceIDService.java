/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.firebaseexample;

import android.util.Log;

import com.firebase.client.Firebase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static String TAG = MyFirebaseInstanceIDService.class.getCanonicalName();

    public MyFirebaseInstanceIDService() {
    }

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String token) {
        // TODO: Implement this method to send token to your app server.
        Firebase ref = new Firebase(Config.FIREBASE_URL);

        //Creating Person object
        Person person = new Person();

        //Adding values
        person.setName(token);
        person.setAddress("Pritesh - Toronto");

        //Storing values to firebase
        ref.child("Persons").child("person").setValue(person);
    }
}
