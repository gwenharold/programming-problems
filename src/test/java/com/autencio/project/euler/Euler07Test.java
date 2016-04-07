package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Euler07Test {

	private Euler07 nthPrime;
	
	@Before
	public void setUp() {
		nthPrime = new Euler07();
	}
	
	@Test
	public void testFirstTestCase() {
		long result = nthPrime.getPrime(3);
		assertThat(result, is(5L));
	}
	
	@Test
	public void testSecondTestCase() {
		long result = nthPrime.getPrime(6);
		assertThat(result, is(13L));
	}
}
