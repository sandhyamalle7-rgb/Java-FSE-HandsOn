package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")
    public String home(){

        return "Spring Boot REST API Running";

    }


    @GetMapping("/hello")
    public String hello(){

        return "Hello World RESTful Web Service";

    }

}