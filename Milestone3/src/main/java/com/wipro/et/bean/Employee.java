package com.wipro.et.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employeeprofile")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    private String name;
    @ManyToOne
    private EmployeeContactNumbers empContactNumbers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeContactNumbers getEmpContactNumbers() {
        return empContactNumbers;
    }

    public void setEmpContactNumbers(EmployeeContactNumbers empContactNumbers) {
        this.empContactNumbers = empContactNumbers;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", empContactNumbers='" + empContactNumbers + '\'' +
                '}';
    }

}
