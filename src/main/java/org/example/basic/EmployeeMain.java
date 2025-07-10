package org.example.basic;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp = new Employee(12,"Raj",80000);
        System.out.println(emp);
        Employee emp1 = new Employee(13,"Vijay",40000);
        System.out.println(emp1);

        /*Based on following salary criteria we will decide whether
            scott is a developer OR Designer OR Tester
            salary >= 75000 [Developer]
            salary >= 40000 [Designer]
            salary >=250000 [Tester]
        */

        double empSalary = emp.getEmployeeSalary();
        String empName = emp.getEmployeeName();
        if(empSalary >= 75000){
            System.out.println(empName + " is Developer ");
        } else if (empSalary >= 40000) {
            System.out.println(empName + " is Designer ");
        }else {
            System.out.println(empName + " is Tester ");
        }
    }
}
