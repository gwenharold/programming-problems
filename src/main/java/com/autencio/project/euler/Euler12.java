package com.autencio.project.euler;

import com.autencio.common.utils.MathUtils;

/**
 * Project Euler 12  - Highly divisible triangular number
 * 
 * @author gwen
 *
 */
public class Euler12 {

	public long getTriangleNumberWithFactorsOver(long divisor) {
		
		int factors = 0;
		int i = 1;
		long triangle = 0;
		do {
			triangle = getTriangleNumber(i);
			factors = numberOfFactors(triangle);
			i++;
		}while(divisor > factors);

		return triangle;
	}

	public static long getTriangleNumber(long number) {
		return (number * (number + 1)) / 2;
	}

	private int numberOfFactors(long triangle) {
		
		int size = 2;
		long start = 2;
		long end = triangle/2;

		do {
			if(MathUtils.isFactor(triangle, start)) {
				size += 2;
				end = triangle/start;
			}
			start++;
		}while(start < end);
		return size;
	}
}
