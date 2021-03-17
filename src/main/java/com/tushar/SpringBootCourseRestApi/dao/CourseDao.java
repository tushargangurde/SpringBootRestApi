package com.tushar.SpringBootCourseRestApi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tushar.SpringBootCourseRestApi.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
