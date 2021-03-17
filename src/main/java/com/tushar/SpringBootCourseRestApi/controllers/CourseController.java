package com.tushar.SpringBootCourseRestApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tushar.SpringBootCourseRestApi.entities.Course;
import com.tushar.SpringBootCourseRestApi.services.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return courseService.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public List<Course> getCourse(@PathVariable long courseId) {
		return courseService.getCourse(courseId);
	}

}
