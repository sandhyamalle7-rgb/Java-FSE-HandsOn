package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Country;
import com.example.service.CountryService;


@RestController
public class CountryController {


    @Autowired
    private CountryService service;


    @GetMapping("/countries")
    public List<Country> getCountries(){

        return service.getCountries();

    }

}