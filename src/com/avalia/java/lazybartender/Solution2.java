//Implementation using Map and Set
package com.avalia.java.lazybartender;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution2 {

	public int solution(int N, int C, int[][] T) {
		Map<Integer, Set<Integer>> map = readCustomer(N, C, T);
		Set<Integer> drinkWithMaxCustomers = getDrinkWithMaxCustomers(map);
		System.out.println(map);
		System.out.println("____________________________________________");
		int count = 0;
		while (drinkWithMaxCustomers.size() > 0) {
			updateDrinksMap(map, drinkWithMaxCustomers);
			count++;
			System.out.println(map);
			System.out.println("____________________________________________");
			drinkWithMaxCustomers = getDrinkWithMaxCustomers(map);
		}
		return count;
	}

	private void updateDrinksMap(Map<Integer, Set<Integer>> map, Set<Integer> x) {
		Set<Integer> toRemove = new HashSet<>();
		toRemove.addAll(x);
		for (Set<Integer> v : map.values()) {
			v.removeAll(toRemove);
		}
	}

	private Set<Integer> getDrinkWithMaxCustomers(Map<Integer, Set<Integer>> map) {
		Set<Integer> max = new HashSet<>();
		for (Set<Integer> v : map.values()) {
			if (v.size() > max.size()) {
				max = v;
			}
		}
		return max;
	}

	private Map<Integer, Set<Integer>> readCustomer(int N, int C, int[][] T) {
		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			map.put(i, new HashSet<Integer>());
		}
		for (int i = 0; i < T.length; i++) {
			for (int j = 1; j < T[i].length; j++) {
				int drink = T[i][j];
				int customer = i + 1;
				if (drink > 0) {
					map.get(drink).add(customer);
				}
			}
		}
		return map;
	}

}
