package com.autencio.project.euler;

/**
 * Largest palindrome product
 * 
 * @author gwen
 *
 */
public class Euler04 {

	public int getLargestPalindrome(int number) {

		int largest = 101101;
		for(int i = number ; i >= 101101; i--) {
			if(isPalindrome(String.valueOf(i))) {
				if(isProductOfTwoThreeDigitNumbers(i)) {
					return i;
				}
			}
		}
		return largest;
	}
	
	private boolean isPalindrome(String number) {
		
		StringBuilder sb = new StringBuilder(number);
		return sb.reverse().toString().equalsIgnoreCase(number);

	}

	private boolean isProductOfTwoThreeDigitNumbers(int number) {
		
		for(int i = 100; i <= 999; i++) {
			if(number % i == 0) {
				int divisor = number / i;
				if(isInBetween(divisor, 100, 999)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isInBetween(int divisor, int start, int end) {
		return divisor >= start && divisor <= end;
	}
}
