package com.learning.corejava.hackerankproblems;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.next();
        scn.close();

        String reverse ="";
        for (int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);
        }
        System.out.println(reverse.equals(word)?"Yes":"No");

    }
}
