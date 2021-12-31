package com.learning.corejava.in28Minutes.java_new_api_features;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
	
	public static boolean isEven(int no) {
		return no%2==0;
	}

	public static void main(String[] args) {
		List<Integer> nos = List.of(10, 20, 13, 2);

//		Predicate<Integer> isEvenNoPredicate = (n) -> n % 2 == 0;
//		nos.stream().filter(isEvenNoPredicate.negate()).forEach(System.out::println);
		
		nos.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
	}

}
