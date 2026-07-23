package com.country.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class State {

    @Id
    private int id;

    private String name;

    @ManyToOne
    private Country country;


    public State() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }


    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country=country;
    }
}