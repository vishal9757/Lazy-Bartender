//Implementation using Array

package com.avalia.java.lazybartender;

public class Solution {

	public int solution(int N, int C, int[][] T) {
		int[][] mat = readCustomer(N, C, T);
		printMat(mat);
		System.out.println("____________________________________________");
		int count = 0;
		int x = getDrinkWithMaxCustomers(mat);
		while (x > 0) {
			printMat(mat);
			System.out.println("____________________________________________");
			removeDrink(mat, x);
			count++;
			x = getDrinkWithMaxCustomers(mat);
		}
		// printMat(mat);
		return count;
	}

	private void removeDrink(int[][] mat, int x) {
		for (int j = 0; j < mat[x].length; j++) {
			if (mat[x][j] == 1) {
				for (int i = 0; i < mat.length; i++) {
					mat[i][j] = 0;
				}
			}
		}
	}

	private int getDrinkWithMaxCustomers(int[][] mat) {
		int temp1 = 0;
		int x = 0;
		for (int i = 0; i < mat.length; i++) {
			int temp = 0;
			for (int j = 0; j < mat[i].length; j++) {
				temp = temp + mat[i][j];
			}
			if (temp1 <= temp && temp != 0) {
				temp1 = temp;
				x = i;
			}
		}
		return x;
	}

	private void printMat(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println("");
		}
	}

	private int[][] readCustomer(int N, int C, int[][] T) {
		int[][] mat = new int[N + 1][C + 1];
		for (int i = 0; i < T.length; i++) {
			for (int j = 1; j < T[i].length; j++) {
				int drink = T[i][j];
				int customer = i + 1;
				mat[drink][customer] = 1;
			}
		}
		return mat;
	}

}
