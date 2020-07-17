package com.rannaghar.web.controllers;

import com.rannaghar.web.model.City;
import com.rannaghar.web.model.Employee;
import com.rannaghar.web.service.CityService;
import com.rannaghar.web.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    GenderService genderService;
    @Autowired
    CityService cityService;

    @RequestMapping(value = "/add-employee",method= RequestMethod.GET)
    public String addEmployee(Model model){
        model.addAttribute("employee",new Employee());


		model.addAttribute("genders", genderService.getGenderMap());
		/*List<String> cities = new ArrayList<>();
		cities.add("Dhaka");
		cities.add("Khulna");
        cities.add("Savar");
        cities.add("Gazipur");
        model.addAttribute("cities",cities );*/

       /* Map<String,String> cities = new HashMap<>();
        cities.put("Dha","Dhaka");
        cities.put("Khl","Khulna");
        cities.put("Cht","Chittagong");
        model.addAttribute("cities",cities);*/

        model.addAttribute("cities",cityService.getCityList());
        return "addEmployee";
    }

    @PostMapping(value ="/add-employee")
    public String addEmployee_Post(@ModelAttribute("employee") Employee employee,Model model){
        System.out.println(employee.toString());
        employee.setGender(genderService.getGenderByKey(employee.getGender()));
        City city=cityService.getCityByCode(employee.getCity());
        employee.setCity(city !=null ? city.getCityName():"None");
        model.addAttribute("employee",employee);
        return "showEmployees";
    }

}
