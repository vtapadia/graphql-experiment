package com.github.vtapadia.experiments.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.vtapadia.experiments.graphql.resources.Employee;
import com.github.vtapadia.experiments.graphql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SampleResolver implements GraphQLQueryResolver {

    @Autowired
    private EmployeeService employeeService;

    public List<Employee> getEmployees(Integer count, Integer offset) {
        return employeeService.getAllEmployees();
    }
}
