package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Employee;

public interface EmployeeService {
    //all Employee
    public List<Employee> getAllEmployee();

    //add
    public Employee addEmployee(Employee employee);

    //remove
    public String removeEmployee(int id);

    //update
    public String updateEmployee(int id);

    //
    public Optional<Employee> findById(int id);
}
