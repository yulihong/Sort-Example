package com.lyu.sortpersontask;

import java.util.List;
import java.util.stream.Stream;

import com.lyu.sortpersontask.beans.Course;

public interface CourseSortSrvice {
	List<Course> courseSort(Stream<Course> courseStream);
}
