package com.learning.corejava.in28Minutes.java_new_api_features;

public class StringNewApiRunner {
	public static void main(String[] args) {
		System.out.println(" ".isBlank());
		System.out.println(" LR ".strip());
		System.out.println(" LR ".stripTrailing());
		System.out.println(" LR ".stripLeading());
		"Line1\nLine2\nLine3".lines().forEach(System.out::println);

		System.out.println("UPPER".transform(s -> s.toLowerCase()));

		System.out.println("My name is %s. My age is %d".formatted("sathian", 26));

		String str = null;
//		Exception in thread "main" java.lang.NullPointerException:
//		Cannot invoke "String.isBlank()" because "str" is null
//		at com.learning.corejava.in28Minutes.java_new_api_features.StringNewApiRunner.main(StringNewApiRunner.java:16)
		System.out.println(str.isBlank());

	}

}
