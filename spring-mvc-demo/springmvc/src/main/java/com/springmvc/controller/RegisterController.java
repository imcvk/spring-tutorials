package com.springmvc.controller;

import com.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
    @ModelAttribute
    public void commonDataForModel(Model model){
        model.addAttribute("Header","Registration Page");
        model.addAttribute("Desc","Spring MVC example");
    }
    @RequestMapping("register")
    public String showForm() {
        return "/register";
    }

    @RequestMapping(path = "/processForm", method = RequestMethod.POST)
    public String processForm(@ModelAttribute User user, Model model) {
        System.out.println(user);
      //  model.addAttribute(user);
        return "success";
    }
}
