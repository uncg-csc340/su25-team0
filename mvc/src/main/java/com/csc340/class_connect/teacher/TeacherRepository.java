package com.csc340.class_connect.teacher;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

  Optional<Teacher> getTeacherByEmail(String email);

  List<Teacher> getTeachersByName(String name);

  List<Teacher> getTeachersByDepartment(String department);

}
