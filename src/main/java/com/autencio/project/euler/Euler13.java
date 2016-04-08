package com.autencio.project.euler;

import java.math.BigInteger;
import java.util.List;

/**
 * Large sum
 * 
 * @author gwen
 */
public class Euler13 {
	
	public String solve(List<String> inputs) {

		BigInteger sum = BigInteger.ZERO;

		for(String input : inputs) {
			sum = sum.add(new BigInteger(input.substring(0, 10)));
		}
		
		return sum.toString();
	}
}
