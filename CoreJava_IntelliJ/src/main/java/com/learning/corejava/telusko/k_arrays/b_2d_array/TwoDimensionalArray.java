package com.learning.corejava.telusko.k_arrays.b_2d_array;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int a[][] = {
                {10,20,30,40},
                {1,2,3,4,5},
                {5,6,7},
                {23,43,12,7}
        };

        System.out.println(a[2][1]);

        System.out.println();

        for (int i=0;i< a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        for (int[] k:a) {
            for (int l:k) {
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
