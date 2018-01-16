package com.github.vtapadia.experiments.graphql.service;

import com.github.vtapadia.experiments.graphql.resources.Employee;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @PostConstruct
    private void createEmployees() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Varesh");
        employee.setAge(30);
        employees.add(employee);
        employee = new Employee();
        employee.setId(2L);
        employee.setName("Paula");
        employee.setAge(25);
        employees.add(employee);


    }
}
