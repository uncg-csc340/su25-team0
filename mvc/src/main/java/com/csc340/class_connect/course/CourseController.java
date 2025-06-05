package com.csc340.class_connect.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
  public Object getAllCourses(Model model) {
    model.addAttribute("courses", courseService.getAllCourses());
    return "student/browse-classes";
  }

  /**
   * Endpoint to get a course by ID
   *
   * @param courseId The ID of the course to retrieve
   * @return The course with the specified ID
   */
  @GetMapping("/courses/{courseId}")
  public Object getCourseById(@PathVariable Long courseId, Model model) {
    model.addAttribute("course", courseService.getCourseById(courseId));
    return "student/class-details";
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

  @GetMapping("/courses/add/{teacherId}")
  public Object showCourseAddForm(@PathVariable Long teacherId, Model model) {
    model.addAttribute("course", new Course());
    model.addAttribute("teacherId", teacherId);
    return "teacher/teacher-add-class";
  }

  public Object showCourseAddForm(Model model) {
    model.addAttribute("course", new Course());
    return "teacher/teacher-add-class";
  }

  /**
   * Endpoint to add a new course
   *
   * @param course The course to add
   * @return List of all courses
   */
  @PostMapping("/courses")
  public Object addCourse(Course course) {
    courseService.addCourse(course);
    return "redirect:/teachers/dashboard/" + course.getTeacher().getTeacherId();
  }

  @GetMapping("/courses/update/{courseId}")
  public Object showCourseUpdateForm(@PathVariable Long courseId, Model model) {
    model.addAttribute("course", courseService.getCourseById(courseId));
    return "teacher/teacher-update-class";
  }

  /**
   * Endpoint to update a course
   *
   * @param courseId The ID of the course to update
   * @param course   The updated course information
   * @return The updated course
   */
  @PostMapping("/courses/update/{courseId}")
  public Object updateCourse(@PathVariable Long courseId, Course course) {
    course.setCourseId(courseId);
    courseService.updateCourse(course);
    return "redirect:/teachers/class-details/" + courseId;
  }

  /**
   * Endpoint to delete a course by ID
   *
   * @param courseId The ID of the course to delete
   */
  @GetMapping("/courses/delete/{courseId}")
  public Object deleteCourse(@PathVariable Long courseId) {
    courseService.deleteCourseById(courseId);
    return "redirect:/teachers/dashboard/1";
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
