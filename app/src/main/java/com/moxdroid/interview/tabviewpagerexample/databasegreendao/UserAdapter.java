/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.moxdroid.interview.tabviewpagerexample.databasegreendao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.adesa.interview.tabviewpagerexample.R;

import java.util.List;

/**
 * Created by Interview on 2016-08-16.
 */
public class UserAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<User> users;

    /**
     * Instantiates a new User adapter.
     *
     * @param context the context
     * @param users   the users
     */
    public UserAdapter(Context context, List<User> users) {
        this.users = users;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        User user = (User) getItem(position);
        if (view == null) {
            view = inflater.inflate(R.layout.userdata, null);
        }
        TextView userid = (TextView) view.findViewById(R.id.userid);
        userid.setText(String.valueOf(user.getId()));
        TextView username = (TextView) view.findViewById(R.id.username);
        username.setText(user.getName());
        return view;
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    /**
     * Sets users.
     *
     * @param data the data
     */
    public void setUsers(List<User> data) {
        users.addAll(data);
        notifyDataSetChanged();
    }
}
