package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.model.Country;
import com.example.service.CountryService;


@RestController
public class CountryController {


@Autowired
CountryService service;



@GetMapping("/countries/{code}")
public Country getCountry(
        @PathVariable String code){

    return service.getCountryByCode(code);

}

}