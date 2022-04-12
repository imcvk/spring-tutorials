package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/springmvc")
public class HomeController {

    @RequestMapping("home")
    public String home(Model model) {
        System.out.println("Home controller called");
        model.addAttribute("name", "Chaitanya Kulkarni");
        model.addAttribute("id", 4567);
        List<String> friends = new ArrayList<>();
        friends.add("asdas");
        friends.add("sdfsdf");
        friends.add("jkhjk");
        friends.add("jksdjfsfk");
        model.addAttribute("friends", friends);
        return "home";
    }

    @RequestMapping("about")
    public String about(Model model) {
        model.addAttribute("name", "Chaitanya Kulkarni");
        model.addAttribute("emailId", "imcvk@gmail.com");
        List<String> skillSet = new ArrayList<>();
        skillSet.add("Java");
        skillSet.add("SQL");
        skillSet.add("J2EE");
        skillSet.add("JavaScript");
        model.addAttribute("skillSet", skillSet);
        return "about";
    }

    @RequestMapping("help")
    public ModelAndView help() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "Chaitanya");
        modelAndView.addObject("rollno", 4534534);
        LocalDateTime localDateTime = LocalDateTime.now();
        modelAndView.addObject("date", localDateTime);
        modelAndView.setViewName("help");
        return modelAndView;
    }
}
