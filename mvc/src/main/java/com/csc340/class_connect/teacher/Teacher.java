package com.csc340.class_connect.teacher;

import java.util.List;

import com.csc340.class_connect.course.Course;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long teacherId;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false, unique = true)
  private String email;
  private String department;

  @OneToMany(mappedBy = "teacher")
  @JsonIgnoreProperties("teacher")
  private List<Course> courses;

  public Teacher() {
  }

  public Teacher(Long teacherId, String name, String email, String department) {
    this.teacherId = teacherId;
    this.name = name;
    this.email = email;
    this.department = department;
  }

  public Teacher(String name, String email, String department) {
    this.name = name;
    this.email = email;
    this.department = department;
  }

  public Teacher(Long teacherId, String name, String email, String department, List<Course> courses) {
    this.teacherId = teacherId;
    this.name = name;
    this.email = email;
    this.department = department;
    this.courses = courses;
  }

  public Teacher(String name, String email, String department, List<Course> courses) {
    this.name = name;
    this.email = email;
    this.department = department;
    this.courses = courses;
  }

  public List<Course> getCourses() {
    return courses;
  }

  public void setCourses(List<Course> courses) {
    this.courses = courses;
  }

  public Long getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(Long teacherId) {
    this.teacherId = teacherId;
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

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

}
