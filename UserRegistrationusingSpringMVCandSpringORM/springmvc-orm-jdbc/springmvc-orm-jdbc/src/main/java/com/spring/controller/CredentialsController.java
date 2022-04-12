package com.spring.controller;

import com.spring.madel.Credentials;
import com.spring.service.CredentialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CredentialsController {
    @Autowired
    CredentialsService credentialsService;

    @RequestMapping(path = "/handleCredentials", method = RequestMethod.POST)
    public String handleCredentials(@ModelAttribute Credentials credentials, Model Model) {
        credentialsService.addDetails(credentials);
        return "success";
    }
}
