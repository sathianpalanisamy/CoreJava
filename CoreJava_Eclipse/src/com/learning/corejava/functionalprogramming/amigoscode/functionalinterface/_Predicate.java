package com.learning.corejava.functionalprogramming.amigoscode.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {

		System.out.println("without predicate");

		System.out.println(isPhoneNumberValid("023"));
		System.out.println(isPhoneNumberValid("0293"));

		System.out.println("with predicate");
		System.out.println(isPhoneNumberValidWithPredicate.test("0223"));
		System.out.println(isPhoneNumberValidWithPredicate.or(containsNumber3).test("027"));
		System.out.println(isPhoneNumberValidWithPredicate.negate().test("0232"));
		
		System.out.println(testUsingTwoArguments.test("11111", "11111"));

	}

	static Predicate<String> isPhoneNumberValidWithPredicate = phoneNumber -> phoneNumber.startsWith("0")
			&& phoneNumber.length() == 3;

	static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

	static BiPredicate<String, String> testUsingTwoArguments = (no1, no2) -> no1.length() == 5 && no2.length() == 6;

	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("0") && phoneNumber.length() == 3;
	}

}
