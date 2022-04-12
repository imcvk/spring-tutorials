package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String homeController() {
        return "home";
    }

    @RequestMapping("/homeForm")
    public String welCome(@RequestParam("Name") String name, Model model) {
        model.addAttribute("Name", name);
        return "welcome";
    }
}
