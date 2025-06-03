package com.csc340.class_connect.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CourseController {

  @Autowired
  private CourseService courseService;

  /**
   * Endpoint to get all courses
   *
   * @return List of all courses
   */
  @GetMapping("/courses")
  public Object getAllCourses() {
    return courseService.getAllCourses();
  }

  /**
   * Endpoint to get a course by ID
   *
   * @param courseId The ID of the course to retrieve
   * @return The course with the specified ID
   */
  @GetMapping("/courses/{courseId}")
  public Course getCourseById(@PathVariable Long courseId) {
    return courseService.getCourseById(courseId);
  }

  /**
   * Endpoint to get courses by name
   *
   * @param name The name of the course to search for
   * @return List of courses with the specified name
   */
  @GetMapping("/courses/name")
  public Object getCoursesByName(@RequestParam String key) {
    if (key != null) {
      return courseService.getCoursesByName(key);
    } else {
      return courseService.getAllCourses();
    }
  }


  /**
   * Endpoint to add a new course
   *
   * @param course The course to add
   * @return List of all courses
   */
  @PostMapping("/courses")
  public Object addCourse(@RequestBody Course course) {
    return courseService.addCourse(course);
  }

  /**
   * Endpoint to update a course
   *
   * @param courseId The ID of the course to update
   * @param course   The updated course information
   * @return The updated course
   */
  @PutMapping("/courses/{courseId}")
  public Course updateCourse(@PathVariable Long courseId, @RequestBody Course course) {
    course.setCourseId(courseId);
    courseService.updateCourse(course);
    return courseService.getCourseById(courseId);
  }

  /**
   * Endpoint to delete a course by ID
   *
   * @param courseId The ID of the course to delete
   */
  @DeleteMapping("/courses/{courseId}")
  public void deleteCourse(@PathVariable Long courseId) {
    courseService.deleteCourseById(courseId);
  }

  /**
   * Endpoint to get courses by teacher ID
   *
   * @param teacherId The ID of the teacher to search for
   * @return List of courses taught by the specified teacher
   */
  @GetMapping("/courses/teacher/{teacherId}")
  public Object getCoursesByTeacherId(@PathVariable Long teacherId) {
    return courseService.getCoursesByTeacherId(teacherId);
  }

}
