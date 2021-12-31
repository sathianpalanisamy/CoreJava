package com.learning.corejava.in28Minutes.functionalprogramming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> nos = List.of(10, 12, 34, 54, 78, 32,15);

//		printAllNumbersInListFunctional(nos);
//		printEvenNumbersInListStructured(nos);
		
		nos.stream().filter(n-> n%2==0).map(n->n*n).forEach(System.out::println);

	}

//	private static void printNum(int n) {
//		System.out.println(n);
//	}

//	private static boolean isEven(int n) {
//		return n % 2 == 0;
//	}

	private static void printAllNumbersInListFunctional(List<Integer> of) {

		of.stream().forEach(System.out::println); // Method Reference

	}

	private static void printEvenNumbersInListStructured(List<Integer> of) {

		of.stream()
//		        .filter(FP01Functional::isEven) // filter only all even number
		        .filter(n->n%2==0)              // Lambda Expression
				.forEach(System.out::println); // Method Reference

	}

}
