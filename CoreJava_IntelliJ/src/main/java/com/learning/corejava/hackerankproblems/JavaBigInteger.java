package com.learning.corejava.hackerankproblems;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {

        try(Scanner scanner= new Scanner(System.in)) {
            BigInteger no1 = scanner.nextBigInteger();
            BigInteger no2 = scanner.nextBigInteger();

            System.out.println(no1.add(no2));
            System.out.println(no1.multiply(no2));



        }

    }
}
