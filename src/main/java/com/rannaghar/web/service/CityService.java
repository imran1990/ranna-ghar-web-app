package com.rannaghar.web.service;

import com.rannaghar.web.model.City;
import com.rannaghar.web.model.Employee;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CityService {
	
	private final JdbcTemplate jdbcTemplate;

    public CityService(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
    }

    public void addCity(City city){
    	String insertStatement = "INSERT INTO tbl_city(uuid, city_code, city_name)\n" + 
    			"VALUES (?, ?, ?);";
    	jdbcTemplate.update(insertStatement, city.getId(), city.getCityCode(), city.getCityName());
    }

    public List<City> getCityList() {
    	String query = "select * from tbl_city";
    	List<Map<String, Object>> fetchedItems = jdbcTemplate.queryForList(query);
    	
    	List<City> cities = new ArrayList();
    	for (Map<String, Object> item : fetchedItems) {
    		City city = new City();
    		city.setId(item.get("uuid").toString());
    		city.setCityCode(item.get("city_code").toString());
    		city.setCityName(item.get("city_name").toString());
    		cities.add(city);
    	}
        return cities;
    }

    public  City getCityByCode(String cityCode) {
    	String query = "select * from tbl_city where city_code = ?";
    	List<Map<String, Object>> fetchedItems = jdbcTemplate.queryForList(query, cityCode);
    	for (Map<String, Object> item : fetchedItems) {
    		City city = new City();
    		city.setId(item.get("uuid").toString());
    		city.setCityCode(item.get("city_code").toString());
    		city.setCityName(item.get("city_name").toString());
    		return city;
    	}
    	return null;
    }
}
