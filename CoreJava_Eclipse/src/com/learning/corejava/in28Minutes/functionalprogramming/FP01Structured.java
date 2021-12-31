package com.learning.corejava.in28Minutes.functionalprogramming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		List<Integer> nos=List.of(10, 12, 34, 54, 78, 32,15);

//		printAllNumbersInListStructured(nos);
		printEvenNumbersInListStructured(nos);


	}

	private static void printAllNumbersInListStructured(List<Integer> of) {

		for (Integer integer : of) {
			System.out.println(integer);
		}
	}

	private static void printEvenNumbersInListStructured(List<Integer> of) {

		for (Integer integer : of) {
			if (integer % 2 == 0)
				System.out.println(integer);
		}
	}

}
