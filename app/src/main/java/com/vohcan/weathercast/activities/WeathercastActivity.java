package com.vohcan.weathercast.activities;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vohcan.weathercast.R;
import com.vohcan.weathercast.fragments.SearchListFragment;

public class WeathercastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weathercast);


        FragmentManager fm = getFragmentManager();
        if(fm.findFragmentById(R.id.main_fragment) == null){
            fm.beginTransaction().add(R.id.main_fragment, new SearchListFragment()).commit();
        }

    }
}
