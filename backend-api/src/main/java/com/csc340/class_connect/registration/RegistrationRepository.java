package com.csc340.class_connect.registration;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long>{

  List<Registration> getRegistrationsByStudentId(Long studentId);

  List<Registration> getRegistrationsByCourseId(Long courseId);

}
