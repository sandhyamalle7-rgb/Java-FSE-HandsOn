package com.example.model;


public class Country {

    private String code;
    private String name;
    private String capital;


    public Country(String code,String name,String capital){

        this.code=code;
        this.name=name;
        this.capital=capital;

    }


    public String getCode(){
        return code;
    }


    public String getName(){
        return name;
    }


    public String getCapital(){
        return capital;
    }

}