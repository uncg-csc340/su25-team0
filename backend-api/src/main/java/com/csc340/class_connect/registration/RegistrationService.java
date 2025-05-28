package com.csc340.class_connect.registration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

  @Autowired
  private RegistrationRepository registrationRepository;

  /**
   * Method to get all registrations
   *
   * @return List of all registrations
   */
  public Object getAllRegistrations() {
    return registrationRepository.findAll();
  }

  /**
   * Method to get a registration by ID
   *
   * @param registrationId The ID of the registration to retrieve
   * @return The registration with the specified ID
   */
  public Registration getRegistrationById(Long registrationId) {
    return registrationRepository.findById(registrationId).orElse(null);
  }

  /**
   * Method to get registrations by student ID
   *
   * @param studentId The ID of the student to search for
   * @return List of registrations for the specified student
   */
  public Object getRegistrationsByStudentId(Long studentId) {
    return registrationRepository.getRegistrationsByStudentId(studentId);
  }

  /**
   * Method to get registrations by course ID
   *
   * @param courseId The ID of the course to search for
   * @return List of registrations for the specified course
   */
  public List<Registration> getRegistrationsByCourseId(Long courseId) {
    return registrationRepository.getRegistrationsByCourseId(courseId);
  }

  /**
   * Method to add a new registration
   *
   * @param registration The registration to add
   * @return List of all registrations
   */
  public Object addRegistration(Registration registration) {
    return registrationRepository.save(registration);
  }

  /**
   * Method to update a registration
   *
   * @param registration The registration to update
   * @return List of all registrations
   */
  public Object updateRegistration(Registration registration) {
    return registrationRepository.save(registration);
  }

  /**
   * Method to delete a registration by ID
   *
   * @param registrationId The ID of the registration to delete
   */
  public void deleteRegistrationById(Long registrationId) {
    registrationRepository.deleteById(registrationId);
  }

}
