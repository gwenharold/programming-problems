package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.math.BigInteger;

import org.junit.Before;
import org.junit.Test;

public class SumOfEvenFibonacciTest {

	private SumOfEvenFibonacci sumOfEvenFibonacci;
	
	@Before
	public void setUp() {
		sumOfEvenFibonacci = new SumOfEvenFibonacci();
	}

	@Test
	public void testFirstTestCase() {
		
		BigInteger result = sumOfEvenFibonacci.getSumOfEvenFibonacci(10L);
		assertThat(result, is(BigInteger.TEN));
	}
	
	@Test
	public void testSecondTestCase() {
		
		BigInteger result = sumOfEvenFibonacci.getSumOfEvenFibonacci(100L);
		BigInteger expected = new BigInteger("44");
		assertThat(result, is(expected));
	}
}
