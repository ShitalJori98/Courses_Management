package com.rest.springrest.dao;

import com.rest.springrest.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {


}
