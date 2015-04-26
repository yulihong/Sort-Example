package com.lyu.sortpersontask.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

import com.lyu.sortpersontask.PersonSortService;
import com.lyu.sortpersontask.beans.Person;

public class PersonSortImpl implements PersonSortService{
	HashSet<Person> seniorPersons = new HashSet<Person>();
	HashSet<Person> adultPersons = new HashSet<Person>();
	HashSet<Person> minorPersons = new HashSet<Person>();
	
//	Comparator<Person> compare = new Comparator<Person>() {
//        public int compare(Person source, Person target) {
//           if(target == null) return 1;
//           if(target.getLastName() == null) return 1;
//           
//           if(source == null) return -1;
//           if(source.getLastName() == null) return -1;
//           
//           Collator collator = Collator.getInstance();
//           if(collator.compare(source.getLastName(), target.getLastName()) == 0) {
//              return collator.compare(source.getFirstName(), target.getFirstName());
//           }else{
//              return collator.compare(source.getLastName(), target.getLastName());
//           }
//        }
//     };
	
	
	/*
	 * Compare with above commented out comparator class you can see how simple it is when use
	 * Java 8 java.util.Comparator.
	 */
	Comparator<Person> compare = Comparator.comparing((Person p) -> p.getLastName())
			.thenComparing(p -> p.getFirstName());

	@Override
	public List<Person> personSort(Stream<Person> personStream) {
		groupPersons(personStream);
		List<Person> sortedPersons = doSort();
		sortedPersons.stream().forEach(p ->{
			System.out.println(p.toString());
		});
		return sortedPersons;
	}
	
	private List<Person> doSort() {
		List<Person> seniorList = new ArrayList<Person>(seniorPersons);
		List<Person> adultList = new ArrayList<Person>(adultPersons);
		List<Person> minorList = new ArrayList<Person>(minorPersons);
		
		seniorList.sort(compare);
		adultList.sort(compare);
		minorList.sort(compare);
	    
	    List<Person> finalList = new ArrayList<Person>();
	    finalList.addAll(seniorList);
	    finalList.addAll(adultList);
	    finalList.addAll(minorList);
	    
		return finalList;
	}

	private void groupPersons(Stream<Person> personStream){
		personStream.forEach(p -> {
			switch(p.getAge())
			{
				case Senior :
					seniorPersons.add(p);
					break;

				case Adult :
					adultPersons.add(p);
					break;
					
				case Minor :
					minorPersons.add(p);
					break;
					
				default:
					throw new RuntimeException("Invalid Person group: " + p.getAge());
			}
		});		
	}

}
