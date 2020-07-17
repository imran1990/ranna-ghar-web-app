package com.rannaghar.web.controllers;

import com.rannaghar.web.model.City;
import com.rannaghar.web.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping(value="/add-city")
    public String addCity_Get(Model model){
        model.addAttribute("city",new City());
        return "addCity";

    }

    @PostMapping(value="/add-city")
    public String addCity_Post(@ModelAttribute("city")City city,Model model){
        city.setId(UUID.randomUUID().toString());
        cityService.addCity(city);

        return "redirect:show-cities";
    }

    @GetMapping(value="/show-cities")
    public String showCity_Get(Model model){
        model.addAttribute("cityList",cityService.getCityList());
        return "showCities";
    }

}
