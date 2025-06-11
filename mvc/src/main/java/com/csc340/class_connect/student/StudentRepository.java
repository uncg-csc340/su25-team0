package com.csc340.class_connect.student;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> getStudentsByMajor(String major);

    @Query(value = "select * from students s where s.gpa >= ?1", nativeQuery = true)
    List<Student> getHonorsStudents(double gpa);

    @Query(value = "select * from students s where s.name like %?1% ", nativeQuery = true)
    List<Student> getStudentsByName(String name);

    Optional<Student> getStudentByEmail(String email);
}
