package com.wipro.et.dao;

import com.wipro.et.Repository.EmployeeRepository;
import com.wipro.et.bean.Employee;
import com.wipro.et.bean.EmployeeContactNumbers;
import com.wipro.et.dao.impl.EmployeeDAO;
import com.wipro.et.data.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    EmployeeRepository userRepository;
    Session session;

    @Override
    public Employee saveEmployee(Employee emp) {
        return userRepository.save(emp);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return userRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public Employee getEmployeeByName(String name) {
        return userRepository.findByName(name);
    }
}
