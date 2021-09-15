package com.example.lenguyenthanhvinh_thuchanh_tuan2.repository;

import com.example.lenguyenthanhvinh_thuchanh_tuan2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
