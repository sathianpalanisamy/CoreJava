package com.learning.corejava.hackerankproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a =scanner.next();
        String b =scanner.next();
        scanner.close();

        int lengthOfAandB = a.length()+b.length();
        System.out.println(lengthOfAandB);

        System.out.println(a.charAt(0)>b.charAt(0)?"Yes":"No");

        System.out.println("cat".compareTo("dog"));

        




        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));


    }
}
