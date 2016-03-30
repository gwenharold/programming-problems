package com.autencio.project.euler;

import junit.framework.Assert;

import org.junit.Test;

public class MultiplesTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testTestCase1() {
		
		System.out.println("test case 1");
		Multiples multiples = new Multiples();
		int result = multiples.sumOfAllMutliples(10);
		Assert.assertEquals(23, result);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testTestCase2() {

		Multiples multiples = new Multiples();
		int result = multiples.sumOfAllMutliples(10);
		Assert.assertEquals(100, result);
	}
}
