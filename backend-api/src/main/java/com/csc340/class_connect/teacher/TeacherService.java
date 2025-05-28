package com.csc340.class_connect.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
  @Autowired
  private  TeacherRepository teacherRepository;
  /**
   * Method to get all teachers
   *
   * @return List of all teachers
   */
  public Object getAllTeachers() {
    return teacherRepository.findAll();}

  /**
   * Method to get a teacher by ID
   *
   * @param teacherId The ID of the teacher to retrieve
   * @return The teacher with the specified ID
   */
  public Teacher getTeacherById(Long teacherId) {
    return teacherRepository.findById(teacherId).orElse(null);}
  /**
   * Method to get teachers by name
   *
   * @param name The name of the teacher to search for
   * @return List of teachers with the specified name
   */
  public Object getTeachersByName(String name) {
    return teacherRepository.getTeachersByName(name);}
  /**
   * Method to get teachers by department
   *
   * @param department The department to search for
   * @return List of teachers with the specified department
   */
  public Object getTeachersByDepartment(String department) {
    return teacherRepository.getTeachersByDepartment(department);}
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
}
