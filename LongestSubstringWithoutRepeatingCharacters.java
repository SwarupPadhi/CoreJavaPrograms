package com.coreJava;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcdabe"));

	}

	public static int lengthOfLongestSubstring(String s) {
		// Creating a set to store the last positions of occurrence
	    HashMap<Character, Integer> seen = new HashMap<>(); 
	    int maximum_length = 0;
	 
	    // starting the inital point of window to index 0
	    int start = 0;
	 
	    for(int end = 0; end < s.length(); end++)
	    {
	      // Checking if we have already seen the element or not
	      if(seen.containsKey(s.charAt(end)))
	      {
	        // If we have seen the number, move the start pointer
	        // to position after the last occurrence
	        start = Math.max(start, seen.get(s.charAt(end)) + 1);
	      }
	 
	      // Updating the last seen value of the character
	      seen.put(s.charAt(end), end);
	      maximum_length = Math.max(maximum_length, end-start + 1);
	    }
	    return maximum_length;
	}
}