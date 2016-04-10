package com.autencio.project.euler;

import com.autencio.common.utils.MathUtils;

/**
 * Longest Collatz sequence
 * 
 * @author gwen
 */
public class Euler14 {

	public long collatzSequence(int n) {

		long longest = 1;
		long c = 1;
		for(int i = 2; i <= n; i++) {
			long collatz = collatz(i);
			if(collatz > c) {
				c = collatz;
				longest = i;
			}
		}
		return longest;
	}
	
	private long collatz(int n) {
		
		long c = n;
		long count = 1;
		do {
			if(MathUtils.isEven(c)) {
				c = c/2;
			} else {
				c = (3 * c) + 1;
			}
			count++;
		}while(c > 1);

		return count;
	}
}
