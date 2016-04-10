package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

public class Euler14Test {

	private Euler14 euler;

    @Before
    public void setUp() {
    	euler = new Euler14();
    }
    
    @Test
    public void testOne() {
    	long result = euler.collatzSequence(10);
    	assertThat(result, is(9L));
    }
  
    @Test
    public void testTwo() {
    	long result = euler.collatzSequence(1000000);
    	assertThat(result, is(837799L));
    }
    
}
