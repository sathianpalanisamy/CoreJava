package com.learning.corejava.hackerankproblems;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<count;i++){
            String pattern =scanner.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Invalid ");
            }
        }
        scanner.close();
    }
}
