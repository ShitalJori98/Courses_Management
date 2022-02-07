package com.rest.springrest.services;
import com.rest.springrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;
public CourseServiceImpl(){
    list= new ArrayList<>();
    list.add(new Course(1,"React Js"));
    list.add(new Course(2,"Next Js"));
    list.add(new Course(3,"React Native"));
}

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(Long courseId) {
     Course c = null;
     for(Course course: list){
         if(course.getId()==courseId){
             c = course;
             break;
         }
     }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
    list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
       list.forEach(e->{
           if(e.getId()== course.getId()){
               e.setName(course.getName());
           }
       });
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        list= this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
    }
}
