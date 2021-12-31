package com.learning.corejava.in28Minutes.java_new_api_features;

public class SwitchExpressionRunner {

	public static String findDayOfWeel(int day) {
		String dayOfWeek = "";
		switch (day) {
		case 1:
			dayOfWeek = "Sunday";
			break;
		case 2:
			dayOfWeek = "Monday";
			break;
		case 3:
			dayOfWeek = "Tuesday";
			break;
		case 4:
			dayOfWeek = "Wednesday";
			break;
		case 5:
			dayOfWeek = "Thursday";
			break;
		case 6:
			dayOfWeek = "Friday";
			break;
		case 7:
			dayOfWeek = "Saturday";
			break;

		default:
			throw new IllegalArgumentException("Invalid Input");
		}

		return dayOfWeek;
	}

	public static String findDayOfWeekUsingSwitchExpression(int day) {
		String dayOfWeek = switch (day) {
		case 1 -> {
			System.out.println("Some complex logic");
			yield "Sunday";
		}
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		case 7 -> "Saturday";

		default -> throw new IllegalArgumentException("Invalid Input");
		};

		return dayOfWeek;
	}

	public static void main(String[] args) {

	}

}
