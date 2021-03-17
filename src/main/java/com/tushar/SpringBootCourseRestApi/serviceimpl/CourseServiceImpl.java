package com.tushar.SpringBootCourseRestApi.serviceimpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.tushar.SpringBootCourseRestApi.entities.Course;
import com.tushar.SpringBootCourseRestApi.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> courses = Arrays.asList(
			new Course(101, "Java", "Java Course for Beginners"),
			new Course(102, "Spring", "Advance Course for Spring Framework"),
			new Course(103, "Javascript", "Best Course for designing"));

	@Override
	public List<Course> getCourses() {

		return courses;
	}

	@Override
	public List<Course> getCourse(long courseId) {

		 return courses.stream()
				.filter(course -> course.getId() == courseId)
				.collect(Collectors.toList());
	
	}

}
