package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Euler12Test {

	private Euler12 euler12;

    @Before
    public void setUp() {
    	euler12 = new Euler12();
    }
    
    @Test
    public void testOne() {
    	long result = euler12.getTriangleNumberWithFactorsOver(5L);
    	assertThat(result, is(28L));
    }

    @Test
    public void testTwo() {
    	long result = euler12.getTriangleNumberWithFactorsOver(500L);
    	assertThat(result, is(76576500L));
    }
}
