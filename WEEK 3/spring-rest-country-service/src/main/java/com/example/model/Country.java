package com.example.model;


public class Country {

    private int id;
    private String name;
    private String capital;


    public Country(int id, String name, String capital) {
        this.id = id;
        this.name = name;
        this.capital = capital;
    }


    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getCapital() {
        return capital;
    }

}