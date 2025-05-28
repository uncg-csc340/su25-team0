package com.csc340.class_connect.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

  @Autowired
  private TeacherService teacherService;

  /**
   * Endpoint to get all teachers
   *
   * @return List of all teachers
   */
  @GetMapping("/teachers")
  public Object getAllTeachers() {
    return teacherService.getAllTeachers();
  }

  /**
   * Endpoint to get a teacher by ID
   *
   * @param id The ID of the teacher to retrieve
   * @return The teacher with the specified ID
   */
  @GetMapping("/teachers/{id}")
  public Teacher getTeacherById(@PathVariable Long id) {
    return teacherService.getTeacherById(id);
  }

  /**
   * Endpoint to get teachers by name
   *
   * @param key The name of the teacher to search for
   * @return List of teachers with the specified name
   */
  @GetMapping("/teachers/name")
  public Object getTeachersByName(@RequestParam String key) {
    if (key != null) {
      return teacherService.getTeachersByName(key);
    } else {
      return teacherService.getAllTeachers();
    }
  }

  /**
   * Endpoint to get teachers by department
   *
   * @param department The department to search for
   * @return List of teachers with the specified department
   */
  @GetMapping("/teachers/department/{department}")
  public Object getTeachersByDepartment(@PathVariable String department) {
    return teacherService.getTeachersByDepartment(department);
  }

  /**
   * Endpoint to add a new teacher
   *
   * @param teacher The teacher to add
   * @return List of all teachers
   */
  @PostMapping("/teachers")
  public Object addTeacher(@RequestBody Teacher teacher) {
    return teacherService.addTeacher(teacher);
  }

  /**
   * Endpoint to update a teacher
   *
   * @param teacher The teacher to update
   * @return List of all teachers
   */
  @PutMapping("/teachers")
  public Object updateTeacher(@RequestBody Teacher teacher) {
    return teacherService.updateTeacher(teacher);
  }

  /**
   * Endpoint to delete a teacher by ID
   *
   * @param id The ID of the teacher to delete
   * @return List of all teachers
   */
  @DeleteMapping("/teachers/{id}")
  public Object deleteTeacher(@PathVariable Long id) {
    return teacherService.deleteTeacher(id);
  }

  /**
   * Endpoint to get statistics by teacher ID
   *
   * @param teacherId The ID of the teacher to retrieve statistics for
   * @return Statistics for the specified teacher
   */
  @GetMapping("/teachers/stats/{teacherId}")
  public Object getStatsByTeacherId(@PathVariable Long teacherId) {
    return teacherService.getStatsByTeacherId(teacherId);
  }
}