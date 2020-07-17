package com.rannaghar.web.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class GenderService {
    static Map<String,String> genders = new HashMap<String, String>();

    public GenderService() {
        genders.put("M", "Male");
        genders.put("F", "Female");
    }
    public Map<String,String> getGenderMap(){
        return genders;
    }
    public String getGenderByKey(String key){
        return genders.get(key);
    }


}
