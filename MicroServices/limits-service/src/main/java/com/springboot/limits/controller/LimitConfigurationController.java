package com.springboot.limits.controller;


import com.springboot.limits.bean.LimitsConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    private LimitsConfiguration limits;

    @GetMapping("/limits")
    public LimitsConfiguration returnLimits(){
        return new LimitsConfiguration(limits.getMaximum(), limits.getMinimum());

    }
}
