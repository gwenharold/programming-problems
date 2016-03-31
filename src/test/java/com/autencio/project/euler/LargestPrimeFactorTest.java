package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class LargestPrimeFactorTest {

	private LargestPrimeFactor largestPrimeFactor;
	
	@Before
	public void setUp() {
		largestPrimeFactor = new LargestPrimeFactor();
	}
	
	@Test
	public void testFirstTestCase() {
		long result = largestPrimeFactor.getLargestPrimeFactor(10);
		assertThat(result, is(5L));
	}
	
	@Test
	public void testSecondTestCase() {
		long result = largestPrimeFactor.getLargestPrimeFactor(17);
		assertThat(result, is(17L));
	}
}