package com.cognizant.injection;

public class Student {

    private int id;
    private String name;
    private String course;

    // Constructor Injection
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Setter Injection
    public void setCourse(String course) {
        this.course = course;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
    }
}