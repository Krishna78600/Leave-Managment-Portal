package com.leavemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leavemgmt.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
