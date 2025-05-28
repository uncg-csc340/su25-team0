package com.csc340.class_connect.teacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc340.class_connect.course.Course;
import com.csc340.class_connect.course.CourseService;
import com.csc340.class_connect.registration.RegistrationService;

@Service
public class TeacherService {
  @Autowired
  private TeacherRepository teacherRepository;

  @Autowired
  private CourseService courseService;

  @Autowired
  private RegistrationService registrationService;

  /**
   * Method to get all teachers
   *
   * @return List of all teachers
   */
  public Object getAllTeachers() {
    return teacherRepository.findAll();
  }

  /**
   * Method to get a teacher by ID
   *
   * @param teacherId The ID of the teacher to retrieve
   * @return The teacher with the specified ID
   */
  public Teacher getTeacherById(Long teacherId) {
    return teacherRepository.findById(teacherId).orElse(null);
  }

  /**
   * Method to get teachers by name
   *
   * @param name The name of the teacher to search for
   * @return List of teachers with the specified name
   */
  public Object getTeachersByName(String name) {
    return teacherRepository.getTeachersByName(name);
  }

  /**
   * Method to get teachers by department
   *
   * @param department The department to search for
   * @return List of teachers with the specified department
   */
  public Object getTeachersByDepartment(String department) {
    return teacherRepository.getTeachersByDepartment(department);
  }

  /**
   * Method to add a new teacher
   *
   * @param teacher The teacher to add
   * @return List of all teachers
   */
  public Object addTeacher(Teacher teacher) {
    return teacherRepository.save(teacher);
  }

  /**
   * Method to update a teacher
   *
   * @param teacher The teacher to update
   * @return List of all teachers
   */
  public Object updateTeacher(Teacher teacher) {
    return teacherRepository.save(teacher);
  }

  /**
   * Method to delete a teacher by ID
   *
   * @param teacherId The ID of the teacher to delete
   * @return List of all teachers
   */
  public Object deleteTeacher(Long teacherId) {
    teacherRepository.deleteById(teacherId);
    return teacherRepository.findAll();
  }

  /**
   * Method to get statistics for a teacher by their ID
   *
   * @param teacherId The ID of the teacher to retrieve statistics for
   * @return A map containing the number of courses and registrations for the teacher
   */
  public Object getStatsByTeacherId(Long teacherId) {
    Map<String, Object> result = new HashMap<String, Object>();
    List<Course> courses = courseService.getCoursesByTeacherId(teacherId);
    int registrationCount = 0;
    for (Course course : courses) {
      registrationCount += registrationService.getRegistrationsByCourseId(course.getCourseId()).size();
    }
    result.put("courseCount", courseService.getCoursesByTeacherId(teacherId).size());
    result.put("registrationCount", registrationCount);
    return result;
  }
}
