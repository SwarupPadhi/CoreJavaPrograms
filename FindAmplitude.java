package com.coreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAmplitude {

	public static void main(String[] args) {
		int arr[] = {3,5,1,3,9,8};
		int k = 4;
		int amplitude = FindAmplitude.solution(arr, k);
		System.out.println("Amplitude of the Array provided is: "+amplitude);
	}
	
	static int solution(int[] A, int k) {
		Set<Integer> amplitudeSet = new HashSet<Integer>();
		for(int i=0; i<=A.length-k; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for(int j = 0; j < A.length; j++) {
				if(j<i || j>=i+k) {
					list.add(A[j]);
				}
			}
			amplitudeSet.add(list.stream().max(Integer::compare).get() - list.stream().min(Integer::compare).get());
		}
		return amplitudeSet.stream().min(Integer::compare).get();
	}
}
