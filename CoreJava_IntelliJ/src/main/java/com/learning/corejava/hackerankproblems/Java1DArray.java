package com.learning.corejava.hackerankproblems;

import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            int n = scn.nextInt();
            int[] a = new int[n];
            for (int i=0;i<a.length;i++){
                a[i] = scn.nextInt();
            }
            for (int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }

        }
    }
}
