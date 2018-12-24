package com.wipro.et.bean;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "employeecontactnumbers")
public class EmployeeContactNumbers implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
        private int id;

        private int employeeid;
        private int cellNumbers;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getEmployeeid() {
            return employeeid;
        }

        public void setEmployeeid(int employeeid) {
            this.employeeid = employeeid;
        }

        public int getCellNumbers() {
            return cellNumbers;
        }

        public void setCellNumbers(int cellNumbers) {
            this.cellNumbers = cellNumbers;
        }

        @Override
        public String toString() {
            return "EmployeeContactNumbers{" +
                    "id=" + id +
                    ", employeeid=" + employeeid +
                    ", cellNumbers=" + cellNumbers +
                    '}';
        }
    }