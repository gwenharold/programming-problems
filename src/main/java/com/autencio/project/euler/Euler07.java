package com.autencio.project.euler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 10001st prime
 * 
 * @author gwen
 */
public class Euler07 {

	private List<Integer> primes;
	private Map<Integer, Boolean> numbers;
	
	public Euler07() {
		
		initializeMap();

	}

	private void initializeMap() {
		
		primes = new ArrayList<Integer>();
		numbers = new HashMap<Integer, Boolean>();

		numbers.put(1, false);
		numbers.put(2, true);
		numbers.put(3, true);
		
		primes.add(2);
		primes.add(3);
	}
	
	public long getPrime(int number) {
		
		if(number <= primes.size()) {
			return primes.get(number - 1);
		}
		
		return calculatePrime(number);
	}

	private long calculatePrime(int number) {
		
		int start = 0;
		boolean notFound = true;

		if(!primes.isEmpty()) {
			start = primes.get(primes.size() -1) + 1;
		}

		do {
			if(isPrime(start)) {
				primes.add(start);

				if(primes.size() == number) {
					notFound = false;
				}
			} 
			start++;
		} while(notFound);

		return primes.get(number - 1); 
	}
	
	private boolean isPrime(int number) {
		
		if(numbers.containsKey(number)) {
			return numbers.get(number);
		}

		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				numbers.put(number, false);
				return false;
			}
		}

		numbers.put(number, true);
		return true;
	}
}
