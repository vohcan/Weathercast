package com.vohcan.weathercast.activities;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.vohcan.weathercast.R;
import com.vohcan.weathercast.fragments.SearchListFragment;
import com.vohcan.weathercast.models.City;

public class WeathercastActivity extends AppCompatActivity implements SearchListFragment.OnCitySelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weathercast);


        FragmentManager fm = getFragmentManager();
        if(fm.findFragmentById(R.id.main_fragment) == null){
            SearchListFragment searchListFragment = new SearchListFragment();
            searchListFragment.setOnCitySelectedListener(this);
            fm.beginTransaction().add(R.id.main_fragment, searchListFragment).commit();
        }

    }


    @Override
    public void onCitySelected(City city) {
        Log.v("TAG", "se ha seleccionado la ciudad ");
        Intent intent = new Intent (this, CityDetailActivity.class);
        startActivity(intent);
    }
}
