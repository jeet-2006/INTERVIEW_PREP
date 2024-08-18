package com.java.practice;

public class Student {
    int x = 10;
    int studentId;
    String studentName;
    static String schoolName;
    public static void setSchoolName (String name) {
        schoolName = name;
    }


    public void getStudentInfo() {
        System.out.println("Name: "+ studentName);
        System.out.println("Id: "+ studentId);
        System.out.println("school: "+ schoolName);
    }

    public void print () {
        System.out.println("printing student");
    }
}
