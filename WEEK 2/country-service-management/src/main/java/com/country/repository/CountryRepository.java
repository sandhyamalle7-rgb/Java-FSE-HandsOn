package com.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.country.entity.Country;

public interface CountryRepository extends JpaRepository<Country,String> {

}