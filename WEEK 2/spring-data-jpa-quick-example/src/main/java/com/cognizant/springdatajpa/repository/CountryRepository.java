package com.cognizant.springdatajpa.repository;

import com.cognizant.springdatajpa.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}