package com.csc340.class_connect.course;

import com.csc340.class_connect.teacher.Teacher;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long courseId;

  @Column(nullable = false)
  private String courseName;

  @Column(nullable = false)
  private String courseCode;

  private String description;

  @Column(nullable = false)
  private int credits;

  @ManyToOne()
  @JoinColumn(name = "teacher_id", nullable = false)
  @JsonIgnoreProperties("courses")
  private Teacher teacher;

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

  public Course(Long courseId, String courseName, String courseCode, String description, int credits, Teacher teacher) {
    this.courseId = courseId;
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.description = description;
    this.credits = credits;
    this.teacher = teacher;
  }

  public Course(String courseName, String courseCode, String description, int credits, Teacher teacher) {
    this.courseName = courseName;
    this.courseCode = courseCode;
    this.description = description;
    this.credits = credits;
    this.teacher = teacher;
  }

  public Long getCourseId() {
    return courseId;
  }

  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }

  public Teacher getTeacher() {
    return teacher;
  }
  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
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
