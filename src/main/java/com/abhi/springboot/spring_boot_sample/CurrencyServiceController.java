package com.abhi.springboot.spring_boot_sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {

    @Value("default.url")
    private String defaultUrl;

    @Autowired
    private CurrencyService currencyService;

    @RequestMapping("/currency-service")
    public CurrencyService getCurrencyService(){
        currencyService.setUrl(defaultUrl);
        return  currencyService;
    }
}
