package com.adesa.interview.tabviewpagerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.priteshpatel.priteshtestlibrary.MyView;

public class CustomLibraryTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View v = new MyView(this);
        setContentView(v);

    }
}
