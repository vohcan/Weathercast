package com.vohcan.weathercast.models;

import java.util.LinkedList;

/**
 * Created by vohcan on 10/3/18.
 */

public class Cities {

    private LinkedList<City> cities;

    public Cities() {
        cities = new LinkedList<>();
        cities.add(new City("Málaga", "España", new Forecast(25, "Sol con nubes", 22F, 23.75F), 22F,23.75F));
        cities.add(new City("Londres", "Inglaterra", new Forecast(15, "lluvias", 23.78F, 15.75F), 23.78F,15.75F));
        cities.add(new City("New York", "Estados Unidos", new Forecast(20, "Nublado", 12F, 35.57F), 12F,35.57F));
    }

    public LinkedList<City> getCities() {
        return cities;
    }

    public City  getCity(int position) {
        return cities.get(position);
    }

    public int getCount(){
        return cities.size();
    }
}
