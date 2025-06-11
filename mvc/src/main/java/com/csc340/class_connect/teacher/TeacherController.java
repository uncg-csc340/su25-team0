package com.csc340.class_connect.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csc340.class_connect.course.CourseService;
import com.csc340.class_connect.registration.RegistrationService;

@Controller
public class TeacherController {

  @Autowired
  private TeacherService teacherService;

  @Autowired
  private CourseService courseService;

  @Autowired
  private RegistrationService registrationService;

  @GetMapping("/teachers/dashboard/{teacherId}")
  public Object getTeacherDashBoard(@PathVariable long teacherId, Model model) {

    model.addAttribute("dashboardInfo", teacherService.getTeacherDashBoard(teacherId));
    model.addAttribute("teacher", teacherService.getTeacherById(teacherId));
    return "teacher/teacher-dashboard";
  }

  @GetMapping("/teachers/class-details/{courseId}")
  public Object getTeacherClassDetails(@PathVariable long courseId, Model model) {
    model.addAttribute("course", courseService.getCourseById(courseId));
    model.addAttribute("registrations", registrationService.getRegistrationsByCourseId(courseId));
    return "teacher/teacher-class-details";

  }

  /**
   * Endpoint to get all teachers
   *
   * @return List of all teachers
   */
  @GetMapping("/teachers")
  public Object getAllTeachers() {
    return teacherService.getAllTeachers();
  }

  /**
   * Endpoint to get a teacher by ID
   *
   * @param id The ID of the teacher to retrieve
   * @return The teacher with the specified ID
   */
  @GetMapping("/teachers/{id}")
  public Object getTeacherById(@PathVariable Long id, Model model) {
    model.addAttribute("teacher", teacherService.getTeacherById(id));
    model.addAttribute("courses", courseService.getCoursesByTeacherId(id));
    model.addAttribute("stats", teacherService.getStatsByTeacherId(id));

    return "teacher/teacher-profile";
  }

  /**
   * Endpoint to show the teacher sign-in page
   *
   * @return The view name for the teacher sign-in page
   */
  @GetMapping("/teachers/signin")
  public Object showSignInPage() {
    return "teacher/teacher-signin";
  }

  /**
   * Endpoint to get a teacher by email
   *
   * @param email The email of the teacher to retrieve
   * @return The teacher with the specified email
   */
  @PostMapping("/teachers/signin")
  public Object getTeacherByEmail(@RequestParam String email, Model model) {
    Teacher teacher = teacherService.getTeacherByEmail(email);
    if (teacher == null) {
      return "redirect:/teachers/signin?username_not_found";
    }
    model.addAttribute("teacher", teacherService.getTeacherByEmail(email));
    return "redirect:/teachers/dashboard/" + teacher.getTeacherId();
  }

  /**
   * Endpoint to get teachers by name
   *
   * @param key The name of the teacher to search for
   * @return List of teachers with the specified name
   */
  @GetMapping("/teachers/name")
  public Object getTeachersByName(@RequestParam String key) {
    if (key != null) {
      return teacherService.getTeachersByName(key);
    } else {
      return teacherService.getAllTeachers();
    }
  }

  /**
   * Endpoint to get teachers by department
   *
   * @param department The department to search for
   * @return List of teachers with the specified department
   */
  @GetMapping("/teachers/department/{department}")
  public Object getTeachersByDepartment(@PathVariable String department) {
    return teacherService.getTeachersByDepartment(department);
  }

  @GetMapping("/teachers/signup")
  public Object showTeacherCreateForm(Model model) {
    model.addAttribute("teacher", new Teacher());
    return "teacher/teacher-signup";
  }

  /**
   * Endpoint to add a new teacher
   *
   * @param teacher The teacher to add
   * @return List of all teachers
   */
  @PostMapping("/teachers")
  public Object addTeacher(Teacher teacher) {
    Teacher newTeacher = (Teacher) teacherService.addTeacher(teacher);
    return "redirect:/teachers/dashboard/" + newTeacher.getTeacherId();
  }

  /**
   * Endpoint to show the teacher update form
   *
   * @param id    The ID of the teacher to update
   * @param model The model to add attributes to
   * @return The view name for the teacher update form
   */
  @GetMapping("/teachers/update/{id}")
  public Object showTeacherUpdateForm(@PathVariable Long id, Model model) {
    model.addAttribute("teacher", teacherService.getTeacherById(id));
    return "teacher/teacher-update-profile";
  }

  /**
   * Endpoint to update a teacher
   *
   * @param teacher The teacher to update
   * @return List of all teachers
   */
  @PostMapping("/teachers/update/{id}")
  public Object updateTeacher(@PathVariable long id, Teacher teacher) {
    teacherService.updateTeacher(teacher);
    return "redirect:/teachers/" + id;
  }

  /**
   * Endpoint to delete a teacher by ID
   *
   * @param id The ID of the teacher to delete
   * @return List of all teachers
   */
  @DeleteMapping("/teachers/{id}")
  public Object deleteTeacher(@PathVariable Long id) {
    return teacherService.deleteTeacher(id);
  }

  /**
   * Endpoint to get statistics by teacher ID
   *
   * @param teacherId The ID of the teacher to retrieve statistics for
   * @return Statistics for the specified teacher
   */
  @GetMapping("/teachers/stats/{teacherId}")
  public Object getStatsByTeacherId(@PathVariable Long teacherId) {
    return teacherService.getStatsByTeacherId(teacherId);
  }
}