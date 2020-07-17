package com.rannaghar.web.service;

import com.rannaghar.web.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private static final List<Employee> employeeList = new ArrayList<>();
    public void save(Employee employee){
        employeeList.add(employee);
    }
}
