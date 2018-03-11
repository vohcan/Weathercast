package com.vohcan.weathercast.models;

/**
 * Created by vohcan on 10/3/18.
 */

public class City {
    private String cityName;
    private  String countryName;
    private Forecast forecast;
    private float longitude;
    private float latitude;

    //constructor

    public City(String cityName, String countryName, Forecast forecast, float longitude, float latitude) {
        this.cityName = cityName;
        this.countryName = countryName;
        this.forecast = forecast;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    //getters and setters

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return getCityName();
    }
}


