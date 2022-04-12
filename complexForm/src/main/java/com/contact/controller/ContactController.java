package com.contact.controller;

import com.contact.model.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {


    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping(path = "/handleContact", method = RequestMethod.POST)
    public String handleContact(@ModelAttribute("contact") Contact contact) {
        System.out.println(contact);
        return "success";
    }
}
