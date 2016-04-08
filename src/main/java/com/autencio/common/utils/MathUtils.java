package com.autencio.common.utils;

public class MathUtils {
	
	public static boolean isPrime(long n) {
		for(int i = 2; i <= n/2; i++) {
			if(isFactor(n, i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(long n) {
		return (n % 2 == 0);
	}
	public static boolean isFactor(long a, long b) {
		return (a % b == 0);
	}

	public static long quotient(long a, long b) {
		return a / b;
	}
}