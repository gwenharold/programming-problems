package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class NthPrimeTest {

	private NthPrime nthPrime;
	
	@Before
	public void setUp() {
		nthPrime = new NthPrime();
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
