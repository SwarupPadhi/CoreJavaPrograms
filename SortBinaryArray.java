package com.coreJava;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortBinaryArray {

	public static void main(String[] args) {
		int[] arr = {1,0,1,1,1,0,1};
		/*
		 * int temp; for(int i=0, j=arr.length-1; i<j;) { if(arr[i]>=arr[j]) { temp =
		 * arr[j]; arr[j]=arr[i]; arr[i]=temp; j--; } else i++; }
		 */
		for (int i = 0; i < arr. length; i++) {
			System. out. print(arr[i] + " ");
		}
		System.out.println();
		
		Arrays.parallelSort(arr);
		 Arrays.stream(arr) 
         .forEach(num->System.out.print(num + " ")); 
		
	}
}
