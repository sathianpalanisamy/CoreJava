package com.learning.corejava.in28minutes;

import java.time.Instant;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
//        String str = "String1";
//        String str2 = "String1";
//
//        System.out.println(str2.contains("rigng"));
//        char[] strArray = str.toCharArray();
//        for (char a : strArray) {
//            System.out.println(a);
//
//        }
//
//        System.out.println(str == str2);
//
//        System.out.println(Instant.now());

//        int[] marks ={10,20,30,40};
//
//        for (int i=0;i< marks.length;i++){
//            System.out.println(marks[i]);
//        }
//
//        int[] marks2=new int[5];
//        for (int i=0;i< marks2.length;i++){
//            System.out.print(marks2[i]);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        String [] splitLine;
        String s;
        int i;
        for(int j=0;j<3;j++){
            splitLine = sc.nextLine().split(" ");
            s = splitLine[0];
            i = Integer.parseInt(splitLine[1]);
            System.out.printf("%-15s%03d\n",s,i);
        }
        System.out.println("================================");
        sc.close();



    }
}
