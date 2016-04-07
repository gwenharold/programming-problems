package com.autencio.project.euler;

/**
 * Smallest multiple
 * 
 * @author gwen
 */
public class Euler05 {

	public int getSmallestMultiple(int max) {

		if (max == 1 || max == 2) {
			return max;
		}

		int[] array = initializeArray(max);

		return compute(array, max);
	}

	private int compute(int[] array, int max) {

		int start = max;
		boolean notFound = true;
		int result = 0;

		if (isOdd(max)) {
			start = max + 1;
		}

		do {
			if (isSmallestMultiple(array, start)) {
				result = start;
				notFound = false;
			}
			start += 2;
		} while (notFound);

		return result;
	}

	private boolean isSmallestMultiple(int[] array, int number) {

		for (int i = 0; i < array.length; i++) {
			if (number % array[i] != 0) {
				return false;
			}
		}
		return true;
	}

	private int[] initializeArray(int max) {
		
		int[] array = new int[max];
		int start = 1;
		for (int i = 0; i < max; i++) {
			array[i] = start;
			start += 1;
		}
		return array;
	}

	private boolean isOdd(int number) {
		if (number % 2 != 0) {
			return true;
		}
		return false;
	}
}
