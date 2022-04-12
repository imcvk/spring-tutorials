package com.springjdbcorm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class RedirectController {
    //    @RequestMapping("/one")
//    public String one() {
//        System.out.println("This is one handler");
//        return "redirect:/two";
//    }
//
//    @RequestMapping("/two")
//    public String two() {
//        System.out.println("This is two handler");
//        return "";
//    }
    @RequestMapping("/one")
    public RedirectView one() {
        System.out.println("This is one handler");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://www.google.com/");
        return redirectView;
    }

    @RequestMapping("/two")
    public String two() {
        System.out.println("This is two handler");
        return "";
    }

}
