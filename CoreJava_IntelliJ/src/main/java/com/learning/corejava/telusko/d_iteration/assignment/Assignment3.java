package com.learning.corejava.telusko.d_iteration.assignment;

public class Assignment3 {

    public static void main(String[] args) {
        /*
        A
        A B
        A B C
        A B C D
         */
        for (int i=65;i<=68;i++){
            for (int j=65;j<=i;j++){
                System.out.print((char) j+" ");
            }
            System.out.println();
        }
    }
}
