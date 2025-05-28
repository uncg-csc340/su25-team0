package com.csc340.class_connect.course;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long courseId;
  private String courseName;
  private String courseCode;
  private String description;
  private int credits;

  public Course() {
  }

  public Course(Long courseId, String courseName, String courseCode, String description, int credits) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.description = description;
    this.credits = credits;
  }

  public Course(String courseName, String courseCode, String description, int credits) {
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.description = description;
    this.credits = credits;
  }

  public Long getCourseId() {
    return courseId;
  }

  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }
}
