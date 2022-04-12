package com.springjdbcorm.controller;

import com.springjdbcorm.dao.UserDAO;
import com.springjdbcorm.model.User;
import com.springjdbcorm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;

    @RequestMapping("register")
    public String showForm() {
        return "register";
    }

    @RequestMapping(path = "/processForm", method = RequestMethod.POST)
    public String processForm(@ModelAttribute User user, Model model
    ) {
        if (user.getUserName().isBlank()) {
            return "redirect:/register";
        } else {
            this.userService.createUser(user);
            return "success";
        }
    }
}
