package org.example.basic;

import java.util.Scanner;

public class Employees {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public Employees(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }

    public static Employees getEmployeesData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employeeID :");
        int id = sc.nextInt();

        System.out.println("Enter the employeeName :");
        String name = sc.nextLine();
        name = sc.nextLine();

        System.out.println("Enter the EmployeeSalary :");
        double salary = sc.nextDouble();

        return new Employees(id, name, salary);
    }
}
