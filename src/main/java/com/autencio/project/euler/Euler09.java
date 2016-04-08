package com.autencio.project.euler;

/**
 * Special Pythagorean triplet
 * 
 * @author gwen
 *
 */
public class Euler09 {

	public int getPhythagoreanTriplet(int number) {

		int result = -1;
		int a, product;
		for (a = 1; a <= number / 3; a++) {
			int b;
			for (b = a + 1; b <= number / 2; b++) {
				int c = number - a - b;

				if (a * a + b * b == c * c) {
					product = a * b * c;
					if (product > result) {
						result = product;
					}
				}
			}
		}
		return result;
	}
}
