package com.example.lenguyenthanhvinh_thuchanh_tuan2.service;

import com.example.lenguyenthanhvinh_thuchanh_tuan2.entity.Employee;
import com.example.lenguyenthanhvinh_thuchanh_tuan2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements  EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void createEmp(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public void updateById(Employee employee) {
        employeeRepository.save(employee);
    }
}
