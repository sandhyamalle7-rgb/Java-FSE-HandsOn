package com.cognizant.springdatajpa;

import com.cognizant.springdatajpa.entity.Country;
import com.cognizant.springdatajpa.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaHandsonApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHandsonApplication.class, args);
    }

    @Override
    public void run(String... args) {

        countryService.addCountry(new Country("IN", "India"));
        countryService.addCountry(new Country("US", "United States"));
        countryService.addCountry(new Country("JP", "Japan"));

        System.out.println("Countries in Database:");

        countryService.getAllCountries()
                .forEach(c ->
                        System.out.println(c.getCode() + " - " + c.getName()));
    }
}