package com.country.controller;


import org.springframework.web.bind.annotation.*;

import com.country.entity.Country;
import com.country.service.CountryService;


@RestController
@RequestMapping("/countries")
public class CountryController {


    private CountryService service;


    public CountryController(CountryService service){
        this.service=service;
    }


    @PostMapping
    public Country addCountry(@RequestBody Country country){

        return service.addCountry(country);
    }



    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code){

        return service.findCountry(code);
    }

}