package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable {
    private String empName;
    private int empID;
    private String empRole;

    
    public Employee() {
        this.empName = "Unknown";
        this.empID = 0;
        this.empRole = "Not Assigned";
    }

    public Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = "Employee"; 
    }

    public Employee(int empID, String empName, String empRole) {
        this.empID = empID;
        this.empName = empName;
        this.empRole = empRole;
    }

    
    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + ", Name: " + empName + ", Role: " + empRole;
    }
}
