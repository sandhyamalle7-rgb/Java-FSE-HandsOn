package com.country.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.country.entity.Country;
import com.country.repository.CountryRepository;


@Service
public class CountryService {


    private CountryRepository repository;


    public CountryService(CountryRepository repository) {

        this.repository = repository;

    }


    public List<Country> getAllCountries() {

        return repository.findAll();

    }


    public Country addCountry(Country country) {

        return repository.save(country);

    }


    public Country getCountryById(int id) {

        return repository.findById(id).orElse(null);

    }


    public void deleteCountry(int id) {

        repository.deleteById(id);

    }

}