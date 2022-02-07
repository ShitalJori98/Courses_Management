package com.rest.springrest.controller;

import com.rest.springrest.entity.Course;
import com.rest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
   private CourseService courseService;


    @GetMapping("/home")
  public String home(){
      return "this is homepage";
  }

     @GetMapping("courses")
     public List<Course> getCourses()
     {
            return this.courseService.getCourses();
      }

      @GetMapping("/courses/{courseId}")
      public Course getCourse(@PathVariable String courseId){
      return this.courseService.getCourse(Long.parseLong(courseId));
      }

      @PostMapping("/courses")
      public Course addCourse(@RequestBody Course course){
       return this.courseService.addCourse(course);
      }

      @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
      }

      @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable Long courseId){
      this.courseService.deleteCourse(courseId);
      }

}
