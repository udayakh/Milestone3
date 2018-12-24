package com.wipro.et.Repository;

import com.wipro.et.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

Employee findByName(String name);
Employee findById(int id);

List<Employee> findAll();

}