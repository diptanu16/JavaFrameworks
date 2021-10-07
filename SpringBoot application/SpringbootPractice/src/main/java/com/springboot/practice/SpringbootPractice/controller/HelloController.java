package com.springboot.practice.SpringbootPractice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {



    @GetMapping("/juta")
    public String helloWorld(){
        return "Welcome to Diptanu code-zone starting today";
    }

    @Value("${welcome.message}")
    private String welcomeMessage;


    @GetMapping("/")
    public String helloworld(){
        return welcomeMessage;
    }
}
