package com.rannaghar.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {

    @RequestMapping(value ="/",method=RequestMethod.GET)
    public String helloWorld(Model model) {
        model.addAttribute("name", "World");
        return "hello";
    }

    @GetMapping("/say-hello")
    public String helloName(Model model, @RequestParam(name = "name", defaultValue = "") String name) {
        model.addAttribute("name", name.isEmpty() ? "World" : name);
        return "hello";
    }
}