package com.coreJava;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println("Array Length after removing duplicates:"+removeDuplicates(nums));
	}
	
	static public int removeDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i< nums.length; i++) {
			set.add(nums[i]);
		}
		return set.size();
    }

}
