package com.springboot.currencyexchangeservice.controller;

import com.springboot.currencyexchangeservice.model.ExchangeValue;
import com.springboot.currencyexchangeservice.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private ExchangeValueRepository repository;

    @GetMapping("/exchange-service/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
        ExchangeValue exchangeValue = repository.findByFromAndTo(from,to);
        return exchangeValue;
    }

}

