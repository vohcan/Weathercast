package com.vohcan.weathercast.models;

/**
 * Created by vohcan on 10/3/18.
 */

public class Forecast {
    private int temperature;
    private String weatherCondition;
    private float longitude;
    private float latitude;

    //constructor

    public Forecast(int temperature, String weatherCondition, float longitude, float latitude) {
        this.temperature = temperature;
        this.weatherCondition = weatherCondition;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    //getters and setters

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
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
}
