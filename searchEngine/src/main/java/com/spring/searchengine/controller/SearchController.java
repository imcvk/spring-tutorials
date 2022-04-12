package com.spring.searchengine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
    @RequestMapping("/search" )
    public RedirectView home(@RequestParam("query") String query) {
        RedirectView redirectView = new RedirectView();
        String url = "https://www.google.com/search?q=" + query;
        redirectView.setUrl(url);
        return redirectView;
    }
}
