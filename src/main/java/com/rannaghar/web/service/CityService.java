package com.rannaghar.web.service;

import com.rannaghar.web.model.City;
import com.rannaghar.web.model.Employee;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    static List<City> cityList = new ArrayList<>();


    public CityService(){

    }

    public void addCity(City city){
        cityList.add(city);
    }

    public List<City> getCityList() {
        return cityList;
    }

    public  City getCityByCode(String cityCode) {
        for (City city : cityList) {
            if (city.getCityCode().equals(cityCode)) {
                return city;
            }
        }  return null;
    }
}
