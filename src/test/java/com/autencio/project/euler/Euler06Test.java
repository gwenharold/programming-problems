package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Euler06Test {

private Euler06 sumSquareDifference;
	
	@Before
	public void setUp() {
		sumSquareDifference = new Euler06();
	}
	
	@Test
	public void testFirstTestCase() {
		long result = sumSquareDifference.compute(3L);
		assertThat(result, is(22L));
	}
	
	@Test
	public void testSecondTestCase() {
		long result = sumSquareDifference.compute(10L);
		assertThat(result, is(2640l));
	}
	
}
