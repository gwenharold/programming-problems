package com.autencio.project.euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplesTest {
	
	private Multiples multiples;

    @Before
    public void setUp() {
        multiples = new Multiples();
    }
    
    @Test
    public void testTen() {
    	int result = multiples.sumOfAllMutliples(10);
    	assertThat(result, is(23));
    }

    @Test
    public void testOneHundred() {
    	int result = multiples.sumOfAllMutliples(100);
    	assertThat(result, is(2318));
    }
}
