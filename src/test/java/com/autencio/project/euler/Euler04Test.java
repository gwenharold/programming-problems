package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Euler04Test {

	private Euler04 largestPalindromeProduct;
	
	@Before
	public void setUp() {
		largestPalindromeProduct = new Euler04();
	}
	
	@Test
	public void testFirstTestCase() {
		int result = largestPalindromeProduct.getLargestPalindrome(101110);
		assertThat(result, is(101101));
	}
	
	@Test
	public void testSecondTestCase() {
		int result = largestPalindromeProduct.getLargestPalindrome(800000);
		assertThat(result, is(793397));
	}
}
