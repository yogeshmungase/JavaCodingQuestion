package org.example.basic;

public class StudentDemo {
    public static void main(String[] args) {

        Student raj = new Student();
        raj.setStudentData(111, "Raj", "Pune");
        System.out.println(raj);

        Student anjali = new Student();
        anjali.setStudentData(122,"Anjali","Pune");
        System.out.println(anjali);

    }
}
