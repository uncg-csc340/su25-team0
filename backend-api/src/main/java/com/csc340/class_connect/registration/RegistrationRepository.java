package com.csc340.class_connect.registration;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long>{

  @Query(value = "select * from registrations r where r.student_id= ?1", nativeQuery = true)
  List<Registration> getRegistrationsByStudentId(Long studentId);


  @Query(value = "select * from registrations r where r.course_id= ?1", nativeQuery = true)
  List<Registration> getRegistrationsByCourseId(Long courseId);

}
