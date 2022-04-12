package com.spring.searchengine.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class ExceptionHandlerDemo {
    //    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Exception e, Model m) {
        String ex = String.valueOf(e.fillInStackTrace());
        System.out.println(e.getLocalizedMessage());

        m.addAttribute("msg", "ex");
        return "nullPage";
    }
}
