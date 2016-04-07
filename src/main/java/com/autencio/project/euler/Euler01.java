package com.autencio.project.euler;

import java.util.ArrayList;
import java.util.List;

/**
 * Multiples of 3 and 5
 * 
 * @author gwen
 */
public class Euler01 {
	
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
