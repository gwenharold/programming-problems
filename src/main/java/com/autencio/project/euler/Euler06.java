package com.autencio.project.euler;

import java.util.HashMap;
import java.util.Map;

/**
 * Sum square difference
 * 
 * @author gwen
 */
public class Euler06 {

    private Map<Long, Long> resultMap;
	private Map<Long, Long> sumOneMap;
	private Map<Long, Long> sumTwoMap;

	public Euler06() {
		
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
