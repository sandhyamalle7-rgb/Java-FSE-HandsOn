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


    // Add new country
    @PostMapping
    public Country addCountry(@RequestBody Country country) {

        return service.addCountry(country);

    }


    // Get all countries
    @GetMapping
    public List<Country> getCountries() {

        return service.getCountries();

    }


    // Find country by code
    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {

        return service.findByCode(code);

    }

}