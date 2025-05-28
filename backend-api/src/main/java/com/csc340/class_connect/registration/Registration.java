package com.csc340.class_connect.registration;

import com.csc340.class_connect.course.Course;
import com.csc340.class_connect.student.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "registrations")
public class Registration {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long registrationId;

  @ManyToOne()
  @JoinColumn(name = "student_id", nullable = false)
  private Student student;

  @ManyToOne()
  @JoinColumn(name = "course_id", nullable = false)
  private Course course;

  public Registration() {
  }

  public Registration(Long registrationId, Student student, Course course) {
    this.registrationId = registrationId;
    this.student = student;
    this.course = course;
  }

  public Registration(Student student, Course course) {
    this.student = student;
    this.course = course;
  }

  public Long getRegistrationId() {
    return registrationId;
  }

  public void setRegistrationId(Long registrationId) {
    this.registrationId = registrationId;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourseId(Course course) {
    this.course = course;
  }
}
