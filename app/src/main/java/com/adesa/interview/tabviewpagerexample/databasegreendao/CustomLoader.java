package com.adesa.interview.tabviewpagerexample.databasegreendao;

import android.support.v4.content.AsyncTaskLoader;
import android.content.Context;
import android.os.SystemClock;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Interview on 2016-08-16.
 */
public class CustomLoader extends AsyncTaskLoader<List<User>> {

    public CustomLoader(Context context) {
        super(context);
    }


    @Override
    protected void onStartLoading() {
        super.onStartLoading();

        //forceLoad();
    }

    @Override
    public List<User> loadInBackground() {

        List<User>userArrayList = new ArrayList<>();
        for (int i =1;i<=100;i++) {
            userArrayList.add(new User(i,"Name " + i));
        }
        //SystemClock.sleep(2000);
        return userArrayList;
    }


}
