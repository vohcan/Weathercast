package com.vohcan.weathercast.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vohcan.weathercast.R;
import com.vohcan.weathercast.models.Cities;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailPagerFragment extends Fragment {


    public DetailPagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_detail_pager, container, false);

        ViewPager pager = root.findViewById(R.id.view_pager);
        pager.setAdapter(new DetailPagerAdapter(getFragmentManager()));


        return root;
    }

}

class DetailPagerAdapter extends FragmentPagerAdapter{
    private Cities cities;


    public DetailPagerAdapter(FragmentManager fm) {
        super(fm);
        cities = new Cities();
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return cities.getCount();
    }
}
