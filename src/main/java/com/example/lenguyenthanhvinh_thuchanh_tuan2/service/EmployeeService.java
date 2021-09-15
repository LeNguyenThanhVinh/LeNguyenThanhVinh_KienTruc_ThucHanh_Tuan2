package com.example.lenguyenthanhvinh_thuchanh_tuan2.service;

import com.example.lenguyenthanhvinh_thuchanh_tuan2.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> findAll();

    Employee getEmployee(int id);

    void createEmp(Employee employee);

    void deleteById(int id);

    void updateById(Employee employee);
}
