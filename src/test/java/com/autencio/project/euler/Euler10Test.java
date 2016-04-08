package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Euler10Test {

	private Euler10 euler;

	@Before
	public void setUp() {
		euler = new Euler10();
	}
	
	@Test
	public void testFirstCase() {
		long result = euler.solve(10);
		assertThat(result, is(17L));
	}
}
