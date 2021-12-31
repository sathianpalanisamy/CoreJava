package com.learning.corejava.in28Minutes.java_new_api_features;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("sathian");
		names.add("saravana");
		names.add("sanjay");
		
		doNotChange(List.copyOf(names));
		System.out.println(names);
		
		
		
		
	}

	private static void doNotChange(List<String> names) {
		names.add("shree");
		
	}

}
