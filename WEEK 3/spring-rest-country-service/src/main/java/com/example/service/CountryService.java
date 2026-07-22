package com.example.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Country;


@Service
public class CountryService {


    public List<Country> getCountries(){

        return Arrays.asList(

            new Country(1,"India","New Delhi"),
            new Country(2,"USA","Washington DC"),
            new Country(3,"Japan","Tokyo")

        );

    }

}