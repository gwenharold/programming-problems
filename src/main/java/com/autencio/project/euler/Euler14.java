package com.autencio.project.euler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Euler14 {

	private static Map<Integer, Integer> cache = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int t = sc.nextInt();

//		for(int i = 1; i <= 1000000; i++) {
//			//int n = sc.nextInt();
//			int result = getHighestSequence(i);
//			System.out.println(result);
//		}
		int result = getHighestSequence(1000000);
		System.out.println(result);
	}

	private static int getHighestSequence(int number) {
		int result = 1;
		int max = 1;
		for(int i = 1; i <= number; i++) {
			int count = getCountSequence(i);
			if(count >= max) {
				max = count;
				result = i;
			}
		}
		return result;
	}
	
	private static int getCountSequence(int number) {

		int count = 1;
		if(number == 1) {
			return 1;
		} else if (isInCache(number)) {
			return cache.get(number);
		} else {
			if(isEven(number)) {
				count += getCountSequence(number/2);
			} else {
				count += getCountSequence((3 * number) + 1);
			}
		}
		return count;
		/*
		if(isInCache(number)) {
			return cache.get(number);
		}
		
		if(number == 1) {
			cache.put(1, 1);
			return 1;
		}

		int count = 1;
		int num = number;
		
		boolean notFound = true;
		do {
			if(isEven(num)) {
				num = computeEvenSequence(num);
			} else {
				num = computeOddSequence(num);
			}
			if(isInCache(num)) {
				count += cache.get(num);
				notFound = false;
			} else {
				count++;
			}
			if(num == 1) {
				notFound = false;
			}
		}while(notFound);

		cache.put(number, count);
		return count;
		*/

	}
	
	private static boolean isInCache(int number) {
		return cache.containsKey(number);
	}

	private static int computeEvenSequence(int number) {
		return number / 2;
	}
	
	private static int computeOddSequence(int number) {
		return (3 * number) + 1;
	}
	
	private static boolean isEven(int number) {
		return (number % 2) == 0;
	}
}
