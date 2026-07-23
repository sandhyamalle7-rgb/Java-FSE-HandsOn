package com.example;

public class Country {

    private String countryName;

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void display() {
        System.out.println("Country Name : " + countryName);
    }
}