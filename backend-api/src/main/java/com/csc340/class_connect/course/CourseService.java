package com.csc340.class_connect.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

  @Autowired
  private CourseRepository courseRepository;

  /**
   * Method to get all courses
   *
   * @return List of all courses
   */
  public Object getAllCourses() {
    return courseRepository.findAll();
  }

  /**
   * Method to get a course by ID
   *
   * @param courseId The ID of the course to retrieve
   * @return The course with the specified ID
   */
  public Course getCourseById(Long courseId) {
    return courseRepository.findById(courseId).orElse(null);
  }

  /**
   * Method to get courses by name
   *
   * @param name The name of the course to search for
   * @return List of courses with the specified name
   */
  public Object getCoursesByName(String name) {
    return courseRepository.getCoursesByCourseName(name);
  }


  /**
   * Method to add a new course
   *
   * @param course The course to add
   * @return List of all courses
   */
  public Object addCourse(Course course) {
    return courseRepository.save(course);
  }

  /**
   * Method to update a course
   *
   * @param course The course to update
   * @return List of all courses
   */
  public Object updateCourse(Course course) {
    return courseRepository.save(course);
  }

  /**
   * Method to delete a course by ID
   *
   * @param courseId The ID of the course to delete
   * @return List of all courses after deletion
   */
  public Object deleteCourseById(Long courseId) {
    courseRepository.deleteById(courseId);
    return courseRepository.findAll();
  }

  public Object getCoursesByTeacherId(Long teacherId) {
    return courseRepository.getCoursesByTeacherId(teacherId);
  }

}
