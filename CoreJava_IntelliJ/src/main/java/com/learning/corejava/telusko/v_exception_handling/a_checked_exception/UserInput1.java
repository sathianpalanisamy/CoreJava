package com.learning.corejava.telusko.v_exception_handling.a_checked_exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput1 {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int no = Integer.parseInt(bufferedReader.readLine());
        System.out.println("The no is "+no);


    }
}
