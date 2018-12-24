package com.wipro.et.service;

import com.wipro.et.bean.Employee;
import com.wipro.et.dao.impl.EmployeeDAO;
import com.wipro.et.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDAO employeeDAO;
    @Override
    public String doSaveEmployee(Employee employee) {
        Employee saveEmp = employeeDAO.saveEmployee(employee);
        if(saveEmp !=null)
            return "Employee saved successfully with id as "+employee.getId();
        else
            return "Employee not saved";
    }

    @Override
    public List<Employee> doGetAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public Employee doGetEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    public Employee doGetEmployeeByName(String name) {
        return employeeDAO.getEmployeeByName(name);
    }
}
