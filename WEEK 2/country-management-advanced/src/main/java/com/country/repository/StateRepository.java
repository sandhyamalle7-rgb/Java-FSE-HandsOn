package com.country.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.country.entity.State;


public interface StateRepository extends JpaRepository<State,Integer>{

}