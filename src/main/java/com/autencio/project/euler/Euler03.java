package com.autencio.project.euler;

import java.util.HashMap;
import java.util.Map;

import com.autencio.common.utils.MathUtils;

/**
 * Largest prime factor
 * 
 * @author gwen
 */
public class Euler03 {

	private Map<Long, Boolean> primes;
	
	public Euler03() {
		primes = new HashMap<Long, Boolean>();
	}
	
	public long getLargestPrimeFactor(long number) {

		long largestPrime = 1;
		long max = number;
		int start = 3;
		
		if(MathUtils.isEven(number)) {
			largestPrime = 2;
		}
		for(long i = start; i <= max; i+=2) {
			if(MathUtils.isFactor(number, i)) {
				if(isPrime(i)) {
					if(largestPrime < i) {
						largestPrime = i;
					}
				}
			}
		}
		return largestPrime;
	}

	private boolean isPrime(long number) {

		if(primes.containsKey(number)) {
			return primes.get(number);
		}
		
		for(long i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				primes.put(number, false);
				return false;
			}
		}

		primes.put(number, true);
		return true;
	}
}
