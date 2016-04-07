package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Euler05Test {

	private Euler05 smallestMultiple;

	@Before
	public void setUp() {
		smallestMultiple = new Euler05();
	}

	@Test
	public void testFirstTestCase() {
		int result = smallestMultiple.getSmallestMultiple(3);
		assertThat(result, is(6));
	}

	@Test
	public void testSecondTestCase() {
		int result = smallestMultiple.getSmallestMultiple(4);
		assertThat(result, is(12));
	}

	@Test
	public void testThirdTestCase() {
		int result = smallestMultiple.getSmallestMultiple(10);
		assertThat(result, is(2520));
	}
}
