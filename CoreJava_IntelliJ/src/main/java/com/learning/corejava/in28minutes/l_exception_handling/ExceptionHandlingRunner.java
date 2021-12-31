package com.learning.corejava.in28minutes.l_exception_handling;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method1();
        System.out.println("Main Ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 Ended");
    }

    private static void method2() {
        String str = null;
        System.out.println(str.length());
        System.out.println("Method2 Ended");
    }
}
