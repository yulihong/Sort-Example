package com.lyu.sortpersontask.impl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.lyu.sortpersontask.CourseSortSrvice;
import com.lyu.sortpersontask.beans.Course;

public class CourseSortImpl implements CourseSortSrvice {
	Comparator<Course> compare = Comparator.comparing((Course c) -> c.getClassName())
		    .thenComparing(c -> c.getTeacherName())
		    .thenComparingInt(c -> c.getId());

	@Override
	public List<Course> courseSort(Stream<Course> courseStream) {
		Stream<Course> newStream = courseStream.sorted(compare);
		// TODO Auto-generated method stub
		List<Course> sortedCourses = newStream.collect(Collectors.toList());
		sortedCourses.stream().forEach(c ->{
			System.out.println(c.toString());
		});
		
		return sortedCourses;
	}

}
