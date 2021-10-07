package com.springboot.currencycalculation.facade;


import com.springboot.currencycalculation.model.CalculateAmount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-exchange-service",url="http://localhost:8000")
public interface CurrencyExchangeProxy {
    @GetMapping("/exchange-service/from/{from}/to/{to}")
    public CalculateAmount retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);


}
