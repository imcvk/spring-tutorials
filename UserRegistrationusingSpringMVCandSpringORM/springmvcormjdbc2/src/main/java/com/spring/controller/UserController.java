package com.spring.controller;

import com.spring.model.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/register")
    public String showForm() {
        return "register";
    }

    @RequestMapping(value = "/processForm",method = RequestMethod.POST)
    public String processForm(@ModelAttribute User user, Model model) {
        System.out.println(user.getEmail());
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        userService.createUser(user);
        return "success";
    }
}
