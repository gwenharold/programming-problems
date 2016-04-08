package com.autencio.project.euler;

import com.autencio.common.utils.MathUtils;

public class Euler10 {

	public long solve(long input) {
		return getSum(input);
	}

	private long getSum(long input) {

		int sum = 0;
		for(int i = 2; i <= input; i++) {
			if(MathUtils.isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}
}
