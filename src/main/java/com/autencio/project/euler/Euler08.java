package com.autencio.project.euler;

/**
 * Largest product in a series
 * 
 * @author gwen
 */
public class Euler08 {

	public long solve(String input, int length) {
		
		int[] array = convert(input);
		return getLargestProduct(array, length);
	}
	
	private long getLargestProduct(int[] array, int n) {

		long result = 0;
		int max = array.length - n;

		for(int i = 0; i <= max; i++) {
			long product = 1;
			for(int j = 0; j < n; j++) {
				int num = array[j+i];
				product *= num;
			}

			if(product > result){
				result = product;
			}
		}
		return result;
	}

	private int[] convert(String input) {
		return input.chars().map(x -> x - '0').toArray();
	}
}