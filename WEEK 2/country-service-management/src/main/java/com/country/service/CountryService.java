package com.country.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.country.entity.Country;
import com.country.repository.CountryRepository;


@Service
public class CountryService {

    private final CountryRepository repository;


    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }


    public Country addCountry(Country country) {
        return repository.save(country);
    }


    public List<Country> getCountries() {
        return repository.findAll();
    }


    public Country findByCode(String code) {
        return repository.findById(code).orElse(null);
    }

}