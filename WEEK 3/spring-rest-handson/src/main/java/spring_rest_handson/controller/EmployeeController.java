package spring_rest_handson.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring_rest_handson.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    List<Employee> employees = new ArrayList<>();

    @GetMapping
    public List<Employee> getEmployees() {

        employees.add(new Employee(1, "John", "IT", 50000));
        employees.add(new Employee(2, "David", "HR", 40000));

        return employees;
    }
}