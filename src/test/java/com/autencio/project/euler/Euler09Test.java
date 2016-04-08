package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Euler09Test {

	private Euler09 euler;
	
	@Before
	public void setUp() {
		euler = new Euler09();
	}

	@Test
	public void testFirstTestCase() {
		int result = euler.getPhythagoreanTriplet(1000);
		assertThat(result, is(31875000));
	}
}
