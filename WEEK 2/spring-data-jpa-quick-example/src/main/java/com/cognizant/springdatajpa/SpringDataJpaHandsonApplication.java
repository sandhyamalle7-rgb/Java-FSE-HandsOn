package com.cognizant.springdatajpa;

import com.cognizant.springdatajpa.entity.Country;
import com.cognizant.springdatajpa.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaHandsonApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaHandsonApplication.class, args);
    }

    @Override
    public void run(String... args) {

        repository.save(new Country("IN", "India"));
        repository.save(new Country("US", "United States"));

        System.out.println("Countries:");

        repository.findAll().forEach(c ->
                System.out.println(c.getCode() + " - " + c.getName()));
    }
}