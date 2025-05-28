package com.csc340.class_connect.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

  List<Course> getCoursesByName(String name);

  List<Course> getCoursesByDepartment(String department);

  List<Course> getCoursesByTeacherId(Long teacherId);

}
