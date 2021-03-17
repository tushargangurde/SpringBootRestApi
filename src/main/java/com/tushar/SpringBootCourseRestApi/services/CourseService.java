package com.tushar.SpringBootCourseRestApi.services;

import java.util.List;

import com.tushar.SpringBootCourseRestApi.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public List<Course> getCourse(long courseId);
}
