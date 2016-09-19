/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.firebaseexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.adesa.interview.tabviewpagerexample.R;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class FireBaseExampleActivity extends AppCompatActivity {
    private static String TAG = FireBaseExampleActivity.class.getCanonicalName();

    @InjectView(R.id.editTextName)
    EditText editTextName;
    @InjectView(R.id.editTextAddress)
    EditText editTextAddress;
    @InjectView(R.id.buttonSave)
    Button buttonSave;
    @InjectView(R.id.textViewPersons)
    TextView textViewPersons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_base_example);
        ButterKnife.inject(this);


        if (getIntent().getExtras() != null) {
            for (String key : getIntent().getExtras().keySet()) {
                String value = getIntent().getExtras().getString(key);
                Log.d(TAG, "Key: " + key + " Value: " + value);
            }
        }

        Button subscribeButton = (Button) findViewById(R.id.subscribeButton);
        subscribeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // [START subscribe_topics]
                FirebaseMessaging.getInstance().subscribeToTopic("news");
                // [END subscribe_topics]

                // Log and toast
                String msg = getString(R.string.msg_subscribed);
                Log.d(TAG, msg);
                Toast.makeText(FireBaseExampleActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        Button logTokenButton = (Button) findViewById(R.id.logTokenButton);
        logTokenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get token
                String token = FirebaseInstanceId.getInstance().getToken();

                // Log and toast
                String msg = getString(R.string.msg_token_fmt, token);
                Log.d(TAG, msg);
                Toast.makeText(FireBaseExampleActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @OnClick(R.id.buttonSave)
    public void onClick() {
        //Creating firebase object
        Firebase ref = new Firebase(Config.FIREBASE_URL);

        //Getting values to store
        String name = editTextName.getText().toString().trim();
        String address = editTextAddress.getText().toString().trim();

        //Creating Person object
        Person person = new Person();

        //Adding values
        person.setName(name);
        person.setAddress(address);

        //Storing values to firebase
        ref.child("Persons").child("person").setValue(person);

        //Value event listener for realtime data update
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                for (DataSnapshot postSnapshot : snapshot.getChildren()) {
                    //Getting the data from snapshot
                    Person person = postSnapshot.child("person").getValue(Person.class);

                    //Adding it to a string
                    String string = "Name: " + person.getName() + "\nAddress: " + person.getAddress() + "\n\n";

                    //Displaying it on textview
                    textViewPersons.setText(string);
                }
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
                System.out.println("The read failed: " + firebaseError.getMessage());
            }
        });
    }
}
