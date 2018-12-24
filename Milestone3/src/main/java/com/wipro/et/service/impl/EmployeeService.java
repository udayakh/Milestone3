package com.wipro.et.service.impl;

import com.wipro.et.bean.Employee;

import java.util.List;

public interface EmployeeService {

    String doSaveEmployee(Employee employee);

    List<Employee> doGetAllEmployees();

    Employee doGetEmployeeById(int id);

    Employee doGetEmployeeByName(String name);

}
