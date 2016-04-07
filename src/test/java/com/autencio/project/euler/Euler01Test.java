package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class Euler01Test {
	
	private Euler01 euler;

    @Before
    public void setUp() {
        euler = new Euler01();
    }
    
    @Test
    public void testTen() {
    	int result = euler.sumOfAllMutliples(10);
    	assertThat(result, is(23));
    }

    @Test
    public void testOneHundred() {
    	int result = euler.sumOfAllMutliples(100);
    	assertThat(result, is(2318));
    }
}
