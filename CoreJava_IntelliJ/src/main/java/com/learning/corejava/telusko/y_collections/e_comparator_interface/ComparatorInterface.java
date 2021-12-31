package com.learning.corejava.telusko.y_collections.e_comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(153);
        values.add(134);
        values.add(130);

        Collections.sort(values,(i,j)->i%10>j%10?1:-1);

        for (Integer value:values) {
            System.out.println(value);
        }


    }
}
