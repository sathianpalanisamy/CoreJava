package com.learning.corejava.hackerankproblems.data_structures;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashset {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            int inputCount = scn.nextInt();

            HashSet<String> names= new HashSet<>();

            scn.nextLine();
            while (inputCount-->0){
                names.add(scn.nextLine());
                System.out.println(names.size());
            }
        }
    }
}
