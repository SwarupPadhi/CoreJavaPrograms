package com.coreJava;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 4, 5 };
		int[] nums2 = { 1 };
		System.out.println("Median=" + findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int array1Length = nums1.length;
		int array2Length = nums2.length;
		int[] array3 = new int[array1Length + array2Length];
		int i = 0, j = 0, k = 0;
		while (i < array1Length && j < array2Length) {
			if (nums1[i] < nums2[j])
				array3[k++] = nums1[i++];
			else
				array3[k++] = nums2[j++];
		}

		while (i < array1Length)
			array3[k++] = nums1[i++];

		while (j < array2Length)
			array3[k++] = nums2[j++];

		Arrays.stream(array3).forEach(s -> System.out.println(s));
		if (array3.length == 1) {
			return array3[0];
		} else if (array3.length % 2 != 0) {
			return array3[array3.length / 2];
		} else {
			return (array3[(array3.length / 2)] + array3[(array3.length / 2) - 1]) / 2.0;
		}
	}

}
