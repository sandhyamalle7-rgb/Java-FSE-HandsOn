package com.country.controller;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.country.entity.Country;
import com.country.service.CountryService;


@RestController
@RequestMapping("/countries")
public class CountryController {


    private final CountryService service;


    public CountryController(CountryService service) {
        this.service = service;
    }


    @PostMapping
    public Country addCountry(@RequestBody Country country) {

        return service.addCountry(country);
    }


    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {

        return service.findCountry(code);
    }


    @GetMapping("/name/{name}")
    public List<Country> getByName(@PathVariable String name){

        return service.findByName(name);
    }


    @GetMapping("/search/{keyword}")
    public List<Country> search(@PathVariable String keyword){

        return service.searchCountry(keyword);
    }

}