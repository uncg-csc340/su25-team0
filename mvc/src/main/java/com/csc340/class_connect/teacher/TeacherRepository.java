package com.csc340.class_connect.teacher;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository  extends JpaRepository<Teacher, Long>{

  List<Teacher> getTeachersByName(String name);

  List<Teacher> getTeachersByDepartment(String department);

}
