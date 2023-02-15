package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeedao;

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> empList = employeedao.findAll();
        return empList;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Employee emp = employeedao.save(employee);
        return emp;
    }

    @Override
    public String removeEmployee(int id) {
        employeedao.deleteById(id);
        return "Delete data successfully";

    }

    @Override
    public String updateEmployee(int id) {
        Optional<Employee> emp = employeedao.findById(id);
        if (emp.isPresent()) {
            Employee emps = new Employee();
            employeedao.save(emps);
            return "updated successfully";
        } else {
            return "Employee not found";
        }
    }

    @Override
    public Optional<Employee> findById(int id) {
        Optional<Employee> emp = employeedao.findById(id);
        if (emp.isPresent()) {
            Employee emps = new Employee();
            employeedao.save(emps);
            return emp;
        } else {
            return null;
        }
    }
}
