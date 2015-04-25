package com.lyu.sortpersontask;

import java.util.List;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lyu.sortpersontask.beans.Course;
import com.lyu.sortpersontask.impl.CourseSortImpl;

public class TestSortCourse {
	private CourseSortSrvice service;
	private Stream<Course> courseStream;

	@Before
	public void setUp() throws Exception {
		service = new CourseSortImpl();
		Course course1 = new Course("Class1", "John");
		Course course2 = new Course("Class2", "Bush");
		Course course3 = new Course("Class3", "Bgeorge");
		Course course4 = new Course("Class3", "Ageorge");
		Course course5 = new Course("Class5", "Sixiya5");
		Course course6 = new Course("Class5", "Lamon5");
		courseStream = Stream.of(course1, course2, course3, course4, course5, course6);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testSortCourse() {	
		List<Course> sortedCourses = service.courseSort(courseStream);	
		Assert.assertNotNull(sortedCourses);
	}

}
