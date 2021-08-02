package com.coreJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetativeElement {

	public static void main(String[] args) {
		String string1 = "Java";
        String string2 = string1.intern();
        String string3 = "Java";
        String string4 = new String("Java");
        String string5 =  string4.intern();

        System.out.println(string3 == (string5));
        
        
		String str = "bcdabcead";
		System.out.println(
				"First Non-Repetative Element: " + FirstNonRepetativeElement.findFirstNonRepetativeElement(str));
	}

	static char findFirstNonRepetativeElement(String str) {

		// Simplest
		/*
		 * for (char c : str.toCharArray()) { if (str.indexOf(c) == str.lastIndexOf(c))
		 * { return c; } }
		 */

		// Using LinkedHashMap as it maintains order
		/*
		 * Map<Character, Integer> characterMap = new LinkedHashMap<Character,
		 * Integer>(); for (char ch : str.toCharArray()) { characterMap.put(ch,
		 * characterMap.containsKey(ch) ? characterMap.get(ch) + 1 : 1); } for
		 * (Map.Entry<Character, Integer> entry : characterMap.entrySet()) { if
		 * (entry.getValue() == 1) { return entry.getKey(); } }
		 */

		// Using Java 8
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (Character ch : str.toCharArray()) {
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		return map.entrySet().stream().filter(x ->x.getValue()==1).findFirst().get().getKey();

	}

}
