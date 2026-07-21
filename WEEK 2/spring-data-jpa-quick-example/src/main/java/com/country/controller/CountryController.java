package com.country.controller;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.country.entity.Country;
import com.country.service.CountryService;


@RestController
@RequestMapping("/countries")
public class CountryController {


    private CountryService service;


    public CountryController(CountryService service) {

        this.service = service;

    }


    @GetMapping
    public List<Country> getCountries() {

        return service.getAllCountries();

    }


    @PostMapping
    public Country addCountry(@RequestBody Country country) {

        return service.addCountry(country);

    }


    @GetMapping("/{id}")
    public Country getCountry(@PathVariable int id) {

        return service.getCountryById(id);

    }


    @DeleteMapping("/{id}")
    public String deleteCountry(@PathVariable int id) {

        service.deleteCountry(id);

        return "Country deleted successfully";

    }

}