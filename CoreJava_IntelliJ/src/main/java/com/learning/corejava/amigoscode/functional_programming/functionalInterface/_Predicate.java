package com.learning.corejava.amigoscode.functional_programming.functionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(
                isPhoneNumberValid.test("9597183773")
        );

        System.out.println(
                isPhoneNumberValid.and(isPhoneNoContains3).test("9597183773")
        );

    }

    static Predicate<String> isPhoneNumberValid =
            (phoneNumber) -> phoneNumber.startsWith("95")&&phoneNumber.length()==10;

    static Predicate<String> isPhoneNoContains3 =
            (phoneNo) -> phoneNo.contains("3");
}
