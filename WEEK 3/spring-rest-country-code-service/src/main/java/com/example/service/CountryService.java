package com.example.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Country;


@Service
public class CountryService {


    List<Country> countries = Arrays.asList(

        new Country("IN","India","New Delhi"),
        new Country("US","United States","Washington DC"),
        new Country("JP","Japan","Tokyo")

    );


    public Country getCountryByCode(String code){

        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);

    }

}