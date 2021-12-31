package com.learning.corejava.in28Minutes.functionalprogramming;

import java.util.List;
import java.util.Optional;

public class FP01Exersices {

	public static void main(String[] args) {
		
		List<Integer> nos=List.of(3, 2, 4, 7, 9, 30, 10);

//		printOddNumbersInTheList(nos);

		List<String> courses = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker",
				"Kubernates");

//		printAllCoursesIndividually(courses);
//		printAllCoursesContainsSpringWord(courses);
//		printCourseHasAtleastFourChar(courses);
		
//		nos.stream().filter(n->n%2!=0).map(n->n*n*n).forEach(System.out::println);
		
//		courses.stream().map(n->n+" "+n.length()).forEach(System.out::println);
		
		
		//sum of all number
		
		int sum=nos.stream().filter(element->element%2!=0).reduce(0, (number1,number2)->number1+number2);
//		Optional<Integer> sum=nos.stream().reduce((number1,number2)->number1+number2);
		System.out.println(sum);
		
		

	}
	
	

	private static void printCourseHasAtleastFourChar(List<String> courses) {
		courses.stream()
		       .filter(n->n.length()>=4)
		       .forEach(System.out::println);
		
	}

	private static void printAllCoursesContainsSpringWord(List<String> courses) {
		courses.stream().filter(n -> n.contains("Spring")).forEach(System.out::println);

	}

	private static void printAllCoursesIndividually(List<String> courses) {
		courses.stream().forEach(System.out::println);

	}

	private static void printOddNumbersInTheList(List<Integer> of) {
		of.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

	}

}
