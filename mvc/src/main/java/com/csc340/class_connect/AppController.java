package com.csc340.class_connect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csc340.class_connect.course.CourseService;

@Controller
public class AppController {

  @Autowired
  private CourseService courseService;

  @GetMapping({ "", "/", "/index", "/home" })
  public String getIndex(Model model) {
    model.addAttribute("courses", courseService.getAllCourses());
    return "index";
  }

}
