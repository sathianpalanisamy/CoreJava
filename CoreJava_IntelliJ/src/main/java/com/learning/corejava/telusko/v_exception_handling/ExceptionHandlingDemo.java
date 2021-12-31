package com.learning.corejava.telusko.v_exception_handling;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        try {
            int[] arr =new int[6];
            arr[7] = 10;

            int i =10;
            int j =0;
            int k = i/j;
        }
        catch (ArithmeticException|ArrayIndexOutOfBoundsException e){
            System.err.println("Error : "+e.getMessage());
        }
        finally {
            System.out.println("Bye");
        }
    }
}
