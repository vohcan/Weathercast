package com.vohcan.weathercast.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vohcan.weathercast.R;
import com.vohcan.weathercast.models.Cities;
import com.vohcan.weathercast.models.City;

/**
 * Created by vohcan on 10/3/18.
 */

public class SearchListFragment extends Fragment {

    private OnCitySelectedListener onCitySelectedListener;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);

        View root = inflater.inflate(R.layout.fragment_search_list, container, false);

       ListView list = root.findViewById(android.R.id.list);

        //create model cities

        final Cities cities = new Cities();

        //create adapter

        ArrayAdapter<City> adapter = new ArrayAdapter<City>(getActivity(), android.R.layout.simple_list_item_1,cities.getCities());

        list.setAdapter(adapter);

        //make a listener
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(onCitySelectedListener != null){
                    onCitySelectedListener.onCitySelected(cities.getCity(position));
                }


            }
        });

        return root;
    }

    public void setOnCitySelectedListener(OnCitySelectedListener onCitySelectedListener) {
        this.onCitySelectedListener = onCitySelectedListener;
    }

    public interface OnCitySelectedListener{

        void onCitySelected(City city);
    }
}
