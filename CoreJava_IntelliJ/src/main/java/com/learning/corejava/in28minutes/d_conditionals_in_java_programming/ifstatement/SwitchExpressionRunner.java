package com.learning.corejava.in28minutes.d_conditionals_in_java_programming.ifstatement;

public class SwitchExpressionRunner {
    public static void main(String[] args) {
        System.out.println(determineNameOfDay(1));

    }

    public static String determineNameOfDay(int no) {

        switch (no) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "saturday";
            default:
                return "not a valid case";

        }
    }
}
