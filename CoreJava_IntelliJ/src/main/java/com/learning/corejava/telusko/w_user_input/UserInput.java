package com.learning.corejava.telusko.w_user_input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        int n = 0;
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);

        n= scanner.nextInt();

        System.out.println(n);
    }
}
