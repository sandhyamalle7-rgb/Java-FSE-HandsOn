package com.country.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;


@Entity
public class Country {

    @Id
    private String code;

    private String name;


    @OneToMany
    private List<State> states;


    public Country() {
    }


    public Country(String code,String name,List<State> states){

        this.code=code;
        this.name=name;
        this.states=states;
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code=code;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name=name;
    }


    public List<State> getStates() {
        return states;
    }


    public void setStates(List<State> states) {
        this.states=states;
    }
}