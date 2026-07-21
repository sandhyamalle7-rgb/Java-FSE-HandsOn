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


    public Country findCountry(String code) {
        return repository.findByCode(code);
    }


    public List<Country> findByName(String name) {
        return repository.findByName(name);
    }


    public List<Country> searchCountry(String keyword) {
        return repository.findByNameContaining(keyword);
    }
}