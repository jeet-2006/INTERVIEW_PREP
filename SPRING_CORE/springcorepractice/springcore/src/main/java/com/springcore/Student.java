package com.springcore;

public class Student {
    private int studentId;
    private String studentName;
    private String studenAddress;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudenAddress() {
        return studenAddress;
    }

    public void setStudenAddress(String studenAddress) {
        this.studenAddress = studenAddress;
    }

    public Student() {
    }

    public Student(int studentId, String studentName, String studenAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studenAddress = studenAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studenAddress='" + studenAddress + '\'' +
                '}';
    }
}
