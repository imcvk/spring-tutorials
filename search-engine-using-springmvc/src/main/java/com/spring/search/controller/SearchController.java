package com.spring.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/search")
    public RedirectView search(@RequestParam("query") String query) {
        RedirectView view = new RedirectView();
        String url="https://www.google.com/search?q="+query;
        view.setUrl(url);
        return view;
    }
}
