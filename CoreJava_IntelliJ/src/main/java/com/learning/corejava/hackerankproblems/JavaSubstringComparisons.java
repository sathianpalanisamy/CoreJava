package com.learning.corejava.hackerankproblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String word =scn.next();
        int length = scn.nextInt();
        scn.close();

        List<String> words =new ArrayList<>();

        for (int i=0 ;i<word.length();i++){
            try {
                words.add(word.substring(i,i+length));
            }catch (Exception e){

            }
        }
        System.out.println(words.stream().min(String::compareTo).get());
        System.out.println(words.stream().max(String::compareTo).get());

    }
}
