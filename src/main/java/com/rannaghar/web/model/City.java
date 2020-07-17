package com.rannaghar.web.model;

public class City {
    private String id;
    private String cityCode;
    private String cityName;

    public City(){

    }

    public City(String id, String cityCode, String cityName) {
        this.id = id;
        this.cityCode = cityCode;
        this.cityName = cityName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
