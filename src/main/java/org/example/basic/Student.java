package org.example.basic;

public class Student {
    int studentID;
    String studentName;
    String studentAddress;
    static String collegeName="ICEM";
    static String courseName="Java";

    public void setStudentData(int studentID, String studentName, String studentAddress){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
