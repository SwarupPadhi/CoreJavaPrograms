package com.coreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestpositiveIntegerInArray {

	/*
	 * Given A = [1, 3, 6, 4, 1, 2], the function should return 5.
	 * Given A = [1, 2, 3], the function should return 4.
	 * Given A = [-1, -3], the function should return 1.
	 */
	public static void main(String[] args) {
		int missingNmber = 1;
		int[] A = {-1,-3, 1};
		List<Integer> list = new ArrayList<Integer>();
		for (Integer t : A) {
			list.add(t);
		}
		System.out.println(list);
		list = (List<Integer>) list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			if (missingNmber == list.get(i)) {
				missingNmber++;
			}
		}
		System.out.println("SmallestpositiveIntegerInArray::" + missingNmber);
	}
}
