package com.demo.test;

import java.util.*;

import com.demo.service.EmployeeService;

public class TestEmployeeMgtSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService eservice = new EmployeeService();

        int choice;
        do {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show Employees Sorted by ID");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save Employees to File");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> eservice.addEmployee();
                case 2 -> eservice.removeEmployee();
                case 3 -> eservice.showAll();
                case 4 -> eservice.showSorted();
                case 5 -> eservice.findByName();
                case 6 -> eservice.saveToFile();
                case 7 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
