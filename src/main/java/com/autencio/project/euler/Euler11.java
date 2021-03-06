package com.autencio.project.euler;

/**
 * Largest product in a series
 * 
 * @author gwen
 */
public class Euler11 {

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
					if(product > largest) {
						largest = product;
					}
				}

				// vertical
				if((i + length) <= grid.length) {
					product = grid[i][j];
					for(int y = 1; y < length; y++) {
						product *= grid[i+y][j];
					}
					if(product > largest) {
						largest = product;
					}
				}

				// backslash
				if((j + length) <= grid[0].length && (i + length) <= grid.length) {
					product = grid[i][j];
					for(int y = 1; y < length; y++) {
						product *= grid[i+y][j+y];
					}
					if(product > largest) {
						largest = product;
					}
				}

				// slash
				if((i >= length - 1) && (j + length - 1) <= length) {
					product = grid[i][j];
					for(int y = 1; y < length; y++) {
						product *= grid[i-y][j+y];
					}
					if(product > largest) {
						largest = product;
					}
				}
			}
		}

		return largest;
	}
}
