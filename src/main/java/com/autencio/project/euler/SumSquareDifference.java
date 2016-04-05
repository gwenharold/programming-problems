package com.autencio.project.euler;

import java.util.HashMap;
import java.util.Map;

/**
 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * @author gwen
 */
public class SumSquareDifference {

    private Map<Long, Long> resultMap;
	private Map<Long, Long> sumOneMap;
	private Map<Long, Long> sumTwoMap;

	public SumSquareDifference() {
		
		resultMap = new HashMap<Long, Long>();
		sumOneMap = new HashMap<Long, Long>();
		sumTwoMap = new HashMap<Long, Long>();

	}
	
	public long compute(long number) {
		
		if(resultMap.containsKey(number)) {
			return resultMap.get(number);
		}
		
		long sumOne = 0, sumTwo = 0;

		if(sumOneMap.containsKey(number)) {
			sumOne = sumOneMap.get(number);
		}
		if(sumTwoMap.containsKey(number)) {
			sumTwo = sumTwoMap.get(number);
		}
		
		if(sumOne > 0 && sumTwo > 0) {
			
			long result = sumTwo - sumOne;
			resultMap.put(number, result);
			return result;

		} else {			
			return computeSquareDifference(number, sumOne, sumTwo);
		}
	}

	private long computeSquareDifference(long number, long sumOne, long sumTwo) {
		
		for(int i = 1; i <= number; i++) {
			sumOne += (long) Math.pow(i, 2);
			sumTwo += i;
		}
		
		long sumTwoResult = ((long) Math.pow(sumTwo, 2));
		long result = sumTwoResult - sumOne;
		
		sumOneMap.put(number, sumOne);
		sumTwoMap.put(number, sumTwoResult);
		resultMap.put(number, result);

		return result;
	}
}
