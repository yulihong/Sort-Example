package com.lyu.sortpersontask;

import java.util.List;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lyu.sortpersontask.beans.Person;
import com.lyu.sortpersontask.impl.PersonSortImpl;

public class TestSortPersons {
	private PersonSortService service;
	private Stream<Person> personStream;

	@Before
	public void setUp() throws Exception {
		service = new PersonSortImpl();
		Person person1 = new Person("John", "Smith", Person.AgeGroup.Minor);
		Person person2 = new Person("Terry", "Ben", Person.AgeGroup.Minor);
		Person person3 = new Person("Marry", "Miller", Person.AgeGroup.Adult);
		Person person4 = new Person("Scott", "Curtis", Person.AgeGroup.Adult);
		Person person5 = new Person("Manila", "Young", Person.AgeGroup.Senior);
	    Person person6 = new Person("Kidd", "Ben", Person.AgeGroup.Minor);
		personStream = Stream.of(person1, person2, person3, person4, person5, person6);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortPerson() {
		 
		 List<Person> personSet = service.personSort(personStream);
		Assert.assertNotNull(personSet);
	}
	
	//@Test
	public void testException() {
		 List<Person> personSet = service.personSort(personStream);
		 Assert.assertNotNull(personSet);	
	}
}
