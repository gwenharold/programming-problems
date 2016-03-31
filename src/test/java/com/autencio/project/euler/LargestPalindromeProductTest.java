package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class LargestPalindromeProductTest {

	private LargestPalindromeProduct largestPalindromeProduct;
	
	@Before
	public void setUp() {
		largestPalindromeProduct = new LargestPalindromeProduct();
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
