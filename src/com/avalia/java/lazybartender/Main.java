package com.avalia.java.lazybartender;

public class Main {

	public static void main(String[] args) {
		Solution s1 = new Solution();
		Solution2 s2 = new Solution2();
		int[][] T = { { 8,1, 2, 4, 5, 6, 8, 9, 10 }, {2, 2, 4 }, {2, 2, 5 }, {1, 3 }, { 3,5, 6, 10 }, { 2,1, 2 } };
		s1.solution(10, 6, T);
		s2.solution(10, 6, T);
	}

}
