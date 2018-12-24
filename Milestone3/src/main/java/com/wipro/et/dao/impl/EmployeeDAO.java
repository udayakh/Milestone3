package com.wipro.et.dao.impl;

import com.wipro.et.bean.Employee;

import java.util.List;

public interface EmployeeDAO {

    Employee saveEmployee(Employee emp);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    Employee getEmployeeByName(String name);
}
