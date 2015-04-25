package com.lyu.sortpersontask;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.lyu.sortpersontask.beans.Person;

public class TestPersonBean {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Person p = new Person();
		Assert.assertNull(p.getAge());
		
		Person p1 = new Person(null, null, null);
		Assert.assertNull(p1.getAge());
	}

}
