package com.learning.corejava.telusko.d_iteration.assignment;

public class Assignment1 {

    public static void main(String[] args) {

        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
         */

        for (int i =1;i<=6;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
