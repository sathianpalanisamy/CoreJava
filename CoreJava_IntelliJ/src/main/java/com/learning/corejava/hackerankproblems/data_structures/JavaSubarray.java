package com.learning.corejava.hackerankproblems.data_structures;

import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {

            int size = scn.nextInt();
            scn.nextLine();
            String lines = scn.nextLine();
            String[] line = lines.split(" ");
            int[] array = new int[size];

            for (int i = 0; i < line.length; i++) {
                array[i] = Integer.parseInt(line[i]);
            }
//            int count = 0;
//
//            for (int i = 0; i < array.length; i++) {
//                for (int j = i; j < array.length; j++) {
//                    int sum = 0;
//                    for (int k = i; k <= j; k++) {
//                        sum += array[k];
//                    }
//                    if (sum < 0) {
//                        count++;
//                    }
//
//                }
//            }

            int count=0;
            for(int j=0;j< array.length;j++){
                int sum=0;
                for(int k=j;k< array.length;k++){
                    sum=array[k]+sum;
                    if(sum<0){
                        count++;
                    }
                }
            }
            System.out.println(count);


        }
    }
}
