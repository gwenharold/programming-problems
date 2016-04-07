package com.autencio.project.euler;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Even Fibonacci numbers
 * 
 * @author gwen
 */
public class Euler02 {

	private Map<Integer, BigInteger> map;
	
	public Euler02() {
		map = initializeMap();
	}

	public BigInteger getSumOfEvenFibonacci(long limit) {
		
		BigInteger two = new BigInteger("2");
		BigInteger result = BigInteger.ZERO;
		BigInteger sum = BigInteger.ZERO;
		int counter = 1;
		
		boolean repeat = true;
		do {
			result = fibonacciRecusion(counter);
			counter++;
			if(result.compareTo(BigInteger.valueOf(limit)) == 1) {
				repeat = false;
			} else {
				if(isEven(two, result)) {
					sum = addToSum(result, sum);
				}
			}
		} while(repeat);
		return sum;
	}
	
	private Map<Integer, BigInteger> initializeMap() {
		map = new HashMap<Integer, BigInteger>();
		initializeMapData();
		return map;
	}
	
	private void initializeMapData() {
		map.put(0, BigInteger.ZERO);
		map.put(1, BigInteger.ONE);
	}

	private BigInteger addToSum(BigInteger result, BigInteger sum) {
		sum = sum.add(result);
		return sum;
	}

	private boolean isEven(BigInteger two, BigInteger result) {
		return result.mod(two).equals(BigInteger.ZERO);
	}

	public BigInteger fibonacciRecusion(int number) {

		if(map.containsKey(number)) {
			return map.get(number);
		}

		BigInteger value = fibonacciRecusion(number - 1).add(fibonacciRecusion(number - 2));

		map.put(number, value);
		return value;
	}
}
