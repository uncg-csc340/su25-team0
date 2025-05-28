package com.csc340.class_connect.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String name;
    private String email;
    private String major;
    private double gpa;

    public Student() {
    }

    public Student(Long studentId, String name, String email, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.major = major;
        this.gpa = gpa;
    }

    public Student( String name, String email, String major, double gpa) {
        this.name = name;
        this.email = email;
        this.major = major;
        this.gpa = gpa;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long id) {
        this.studentId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }





}
