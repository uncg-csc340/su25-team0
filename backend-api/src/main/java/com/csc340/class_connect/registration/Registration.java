package com.csc340.class_connect.registration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "registrations")
public class Registration {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long registrationId;
  private Long studentId;
  private Long courseId;

  public Registration() {
  }

  public Registration(Long registrationId, Long studentId, Long courseId) {
    this.registrationId = registrationId;
    this.studentId = studentId;
    this.courseId = courseId;
  }

  public Registration(Long studentId, Long courseId) {
    this.studentId = studentId;
    this.courseId = courseId;
  }

  public Long getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(Long registrationId) {
    this.registrationId = registrationId;
  }

  public Long getStudentId() {
    return studentId;
  }

  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }

  public Long getCourseId() {
    return courseId;
  }

  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }
}
