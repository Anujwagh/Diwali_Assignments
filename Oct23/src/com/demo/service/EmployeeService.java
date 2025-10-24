package com.demo.service;

import java.io.*;
import java.util.*;

import com.demo.beans.Employee;

public class EmployeeService {
    private ArrayList<Employee> empList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Do you want to enter role? (y/n): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter Employee Role: ");
            String role = sc.nextLine();
            empList.add(new Employee(id, name, role));
        } else {
            empList.add(new Employee(id, name));
        }
        System.out.println("Employee added successfully!");
    }

    public void removeEmployee() {
        System.out.print("Enter Employee ID to remove: ");
        int id = sc.nextInt();
        boolean removed = empList.removeIf(emp -> emp.getEmpID() == id);

        if (removed)
            System.out.println("Employee removed successfully!");
        else
            System.out.println("Employee not found!");
    }

    public void showAll() {
        if (empList.isEmpty()) {
            System.out.println("No employees in the list.");
            return;
        }
        System.out.println("All Employees:");
        for (Employee e : empList)
            System.out.println(e);
    }

    public void showSorted() {
        if (empList.isEmpty()) {
            System.out.println("No employees to sort.");
            return;
        }
        empList.sort(Comparator.comparingInt(Employee::getEmpID));
        System.out.println("Employees sorted by ID:");
        for (Employee e : empList)
            System.out.println(e);
    }

    public void findByName() {
        sc.nextLine();
        System.out.print("Enter Employee Name to search: ");
        String name = sc.nextLine();

        boolean found = false;
        for (Employee e : empList) {
            if (e.getEmpName().equalsIgnoreCase(name)) {
                System.out.println("Found: " + e);
                found = true;
            }
        }
        if (!found)
            System.out.println("Employee not found!");
    }

    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.txt"))) {
            oos.writeObject(empList);
            System.out.println("Employees saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }
}
