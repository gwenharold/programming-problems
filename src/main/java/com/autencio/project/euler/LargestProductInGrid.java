package com.autencio.project.euler;


/**
 * 
 * Project Euler Problem 11 - Hacker Rank
 * 
 * What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
 * 
 * @author gwen
 */
public class LargestProductInGrid {

	public long largestProduct(int[][] grid, int length) {

		int largest = 0;
		int product = 0;

		for(int i = 0; i <= grid.length - 1; i++) {
			for(int j = 0; j <= grid[0].length - 1; j++) {

				// horizontal
				if((j + length) <= grid[0].length) {
					product = grid[i][j];
					for(int y = 1; y < length; y++) {
						product *= grid[i][j+y];
					}
					largest = checkIfProductIsLarger(largest, product);
				}

				// vertical
				if((i + length) <= grid.length) {
					product = grid[i][j];
					for(int y = 1; y < length; y++) {
						product *= grid[i+y][j];
					}
					largest = checkIfProductIsLarger(largest, product);
				}

				// backslash
				if((j + length) <= grid[0].length && (i + length) <= grid.length) {
					product = grid[i][j];
					for(int y = 1; y < length; y++) {
						product *= grid[i+y][j+y];
					}
					largest = checkIfProductIsLarger(largest, product);
				}

				// slash
				if((i >= length - 1) && (j + length - 1) <= length) {
					product = grid[i][j];
					for(int y = 1; y < length; y++) {
						product *= grid[i-y][j+y];
					}
					largest = checkIfProductIsLarger(largest, product);
				}
			}
		}

		return largest;
	}

	private int checkIfProductIsLarger(int largest, int product) {
		if(product > largest) {
			largest = product;
		}
		return largest;
	}
}
