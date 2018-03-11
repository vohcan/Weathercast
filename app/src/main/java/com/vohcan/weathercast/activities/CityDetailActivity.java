package com.vohcan.weathercast.activities;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.vohcan.weathercast.R;
import com.vohcan.weathercast.fragments.CityDetailFragment;
import com.vohcan.weathercast.fragments.DetailPagerFragment;

/**
 * Created by vohcan on 11/3/18.
 */

public class CityDetailActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_city_detail);

        FragmentManager fm = getFragmentManager();
//       if(fm.findFragmentById(R.id.fragment_city_detail) == null){
//           DetailPagerFragment detailPagerFragment = new DetailPagerFragment();
//           fm.beginTransaction().add(R.id.fragment_detail_pager).commit();
//      }

    }
}
