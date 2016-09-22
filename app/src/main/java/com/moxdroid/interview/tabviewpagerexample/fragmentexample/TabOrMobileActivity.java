/*
 * Copyright (c) 2016. Pritesh Patel, Toronto, Canada
 */

package com.moxdroid.interview.tabviewpagerexample.fragmentexample;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.adesa.interview.tabviewpagerexample.R;
import com.moxdroid.interview.tabviewpagerexample.dummy.DummyContent;

public class TabOrMobileActivity extends AppCompatActivity
        implements ItemFragment.OnListFragmentInteractionListener, DetailsFragment.OnFragmentInteractionListener {

    DetailsFragment detailsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_or_mobile);

        if (findViewById(R.id.container) != null) {
            ItemFragment itemFragment = new ItemFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, itemFragment)
                    .commit();
        } else {
            detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.article);
        }


    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
        Toast.makeText(this, "Item Clicked : " + item.id, Toast.LENGTH_SHORT).show();
        if (detailsFragment != null)
            detailsFragment.setTextValue(item.content);
        else {
            DetailsFragment newDesriptionFragment = new DetailsFragment();
            Bundle args = new Bundle();

            args.putString(DetailsFragment.KEY_POSITION, item.content);
            newDesriptionFragment.setArguments(args);
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the backStack so the User can navigate back
            fragmentTransaction.replace(R.id.container, newDesriptionFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
