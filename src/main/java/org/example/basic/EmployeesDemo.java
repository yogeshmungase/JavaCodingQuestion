package org.example.basic;

import java.util.Scanner;

public class EmployeesDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of objects :");
        int noOfObjects = sc.nextInt();

        for(int i =1; i<= noOfObjects; i++){
            Employees object = Employees.getEmployeesData();
            System.out.println(object);
        }
        sc.close();
    }
}
