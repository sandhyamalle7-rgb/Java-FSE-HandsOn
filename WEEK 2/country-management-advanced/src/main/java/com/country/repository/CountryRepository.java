package com.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.country.entity.Country;
import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    // Find country by code
    Country findByCode(String code);

    // Query Method 1: Find countries by name
    List<Country> findByName(String name);

    // Query Method 2: Find countries containing letters
    List<Country> findByNameContaining(String keyword);

}