package com.learning.corejava.in28Minutes.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "I am Sathian MP";

		Map<Character, Integer> occureMap = new HashMap<Character, Integer>();

		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			Integer charOcc = occureMap.get(c);
			if (charOcc == null) {
				occureMap.put(c, 1);
			} else {
				occureMap.put(c, charOcc + 1);

			}
		}
		System.out.println(occureMap);
	}

}
