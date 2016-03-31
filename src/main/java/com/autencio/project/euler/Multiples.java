package com.autencio.project.euler;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Euler Problem 1 - Hacker Rank
 *  
 * Find the sum of all the multiples of 3 or 5 below N
 */
public class Multiples {
	
	private static int THREE = 3;
	private static int FIVE = 5;

	public int sumOfAllMutliples(int number) {
		int sum = computeSum(number, THREE, FIVE);
		return sum;
	}

	private int computeSum(int number, int... multiples) {

		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;

		for(int multiple : multiples) {
			for(int i = multiple; i < number; i += multiple) {
				if(isMultiple(i, multiple)) {
					if(!list.contains(i)) {
						sum += i;
						list.add(i);
					}
				}
			}	
		}
		return sum;
	}
	
	private boolean isMultiple(int n, int multiple) {
		return n % multiple == 0;
	}
}
