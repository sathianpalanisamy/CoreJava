package com.learning.corejava.hackerankproblems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class JavaStringTokens {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine().trim();
        scn.close();

        if (word.trim().length()==0){
            System.out.println("0");
            return;
        }

        if (word.length() < 400000 || word.length() > 1) {

            String[] tokens = word.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
