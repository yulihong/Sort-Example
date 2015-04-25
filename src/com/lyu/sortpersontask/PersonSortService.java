package com.lyu.sortpersontask;

import java.util.List;
import java.util.stream.Stream;

import com.lyu.sortpersontask.beans.Person;


public interface PersonSortService {
	List<Person> personSort(Stream<Person> personStream);
	
}
