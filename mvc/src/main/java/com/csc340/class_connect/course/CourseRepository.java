package com.csc340.class_connect.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

  List<Course> getCoursesByCourseName(String name);

@Query(value = "select * from courses c where c.teacher_id= ?1", nativeQuery = true)
  List<Course> getCoursesByTeacherId(Long teacherId);

}
