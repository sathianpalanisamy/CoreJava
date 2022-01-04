package com.learning.corejava.hackerankproblems.data_structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {
            int arraySize = scn.nextInt();
            List<Integer> list = new ArrayList<>(arraySize);
            for (int i = 0; i < arraySize; i++) {
                list.add(scn.nextInt());
            }
            int noOfOperation = scn.nextInt();
            while (noOfOperation-- > 0) {
                String operation = scn.next();
                if (operation.equals("Insert")) {
                    int index = scn.nextInt();
                    int value = scn.nextInt();
                    list.add(index, value);
                }
                if (operation.equals("Delete")) {
                    int index = scn.nextInt();
                    list.remove(index);
                }
            }
            list.forEach(s -> System.out.print(s+" "));
        }

    }
}
