package com.learning.corejava.in28minutes.l_exception_handling;

public class CheckedExceptionRunner {
    public static void main(String[] args) {

        try {
            someOtherMethod1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        someOtherMethod2();
    }

    private static void someOtherMethod2() throws RuntimeException{
    }

    private static void someOtherMethod1() throws InterruptedException {
        Thread.sleep(100);
    }
}
