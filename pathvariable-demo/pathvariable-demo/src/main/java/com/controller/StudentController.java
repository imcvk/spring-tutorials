package com.controller;

import com.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @RequestMapping("/student")
    public String studentForm() {
        return "student";
    }

    @RequestMapping(path = "/handleStudent", method = RequestMethod.POST)
    public String handleStudent(@ModelAttribute("student") Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "student";
        }
        System.out.println(student);
        return "success";
    }

    @RequestMapping("/student/{id}")
    public String handle(@PathVariable("id") int id) {
        System.out.println(id);
        return "handled";
    }
}
