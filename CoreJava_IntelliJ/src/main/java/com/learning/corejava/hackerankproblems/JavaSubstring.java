package com.learning.corejava.hackerankproblems;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String word= scn.next();
        scn.nextLine();
        String index= scn.nextLine();
        scn.close();
        String[] indexes=index.split(" ");
        System.out.print(word.substring(Integer.valueOf(indexes[0]),Integer.valueOf(indexes[1])));

    }
}
