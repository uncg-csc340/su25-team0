package com.csc340.class_connect.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.csc340.class_connect.course.Course;
import com.csc340.class_connect.student.Student;

@Controller
public class RegistrationController {

  @Autowired
  private RegistrationService registrationService;

  /**
   * Endpoint to get all registrations
   *
   * @return List of all registrations
   */
  @GetMapping("/registrations")
  public Object getAllRegistrations() {
    return registrationService.getAllRegistrations();
  }

  /**
   * Endpoint to get a registration by ID
   *
   * @param id The ID of the registration to retrieve
   * @return The registration with the specified ID
   */
  @GetMapping("/registrations/{id}")
  public Registration getRegistrationById(@PathVariable Long id) {
    return registrationService.getRegistrationById(id);
  }

  /**
   * Endpoint to get all registrations for a specific student
   *
   * @param studentId The ID of the student to search for
   * @return List of registrations for the specified student
   */
  @GetMapping("/registrations/student/{studentId}")
  public Object getRegistrationsByStudentId(@PathVariable Long studentId) {
    return registrationService.getRegistrationsByStudentId(studentId);
  }

  /**
   * Endpoint to get all registrations for a specific course
   *
   * @param courseId The ID of the course to search for
   * @return List of registrations for the specified course
   */
  @GetMapping("/registrations/course/{courseId}")
  public Object getRegistrationsByCourseId(@PathVariable Long courseId) {
    return registrationService.getRegistrationsByCourseId(courseId);
  }

  /**
   * Endpoint to add a new registration
   *
   * @param registration The registration to add
   * @return List of all registrations
   */
  @PostMapping("/registrations")
  public Object addRegistration(@RequestParam Long studentId, @RequestParam Long courseId) {
    Registration registration = new Registration();
    registration.setStudent(new Student(studentId));
    registration.setCourse(new Course(courseId));
    registrationService.addRegistration(registration);
    return "redirect:/students/dashboard/" + studentId;
  }

  /**
   * Endpoint to delete a registration by ID
   *
   * @param id The ID of the registration to delete
   */
  @GetMapping("/registrations/delete/{id}")
  public Object deleteRegistration(@PathVariable Long id) {
    Student student = registrationService.getRegistrationById(id).getStudent();
    // Redirect to the student's dashboard after deletion
    return "redirect:/students/dashboard/" + student.getStudentId();
  }

  /**
   * Endpoint to update a registration
   *
   * @param id           The ID of the registration to update
   * @param registration The updated registration information
   * @return The updated registration
   */
  @PutMapping("/registrations/{id}")
  public Object updateRegistration(@PathVariable Long id, @RequestBody Registration registration) {
    registration.setRegistrationId(id); // Ensure the ID is set for the update
    return registrationService.updateRegistration(registration);
  }

}
