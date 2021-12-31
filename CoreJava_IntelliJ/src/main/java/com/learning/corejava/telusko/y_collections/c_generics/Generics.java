package com.learning.corejava.telusko.y_collections.c_generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(01);
        values.add(23);
        values.add(34);

        for (Integer value:values) {
            System.out.println(value);
        }
    }
}
