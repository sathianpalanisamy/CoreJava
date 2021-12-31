package com.learning.corejava.in28Minutes.java_new_api_features;

import java.util.List;

public class TypeInfrencesRunner {
	public static void main(String[] args) {
		List<String> names1 = List.of("sathian","sanjay");
		List<String> names2 = List.of("saravana","lakshmi");
		
		var names = List.of(names1,names2);
//		var abc = null;  //not allowed
		names.stream().forEach(System.out::println);
		
		for (var list : names) {
			System.out.println(list);
		}
		
		
	}

}
