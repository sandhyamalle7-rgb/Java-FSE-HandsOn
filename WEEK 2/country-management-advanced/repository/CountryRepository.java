package com.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.country.entity.Country;

public interface CountryRepository extends JpaRepository<Country,String>{

    Country findByName(String name);


    @Query("select c from Country c where c.code=?1")
    Country findByCode(String code);


    @Query(value="select * from country where code=?1",
    nativeQuery=true)
    Country nativeFind(String code);

}