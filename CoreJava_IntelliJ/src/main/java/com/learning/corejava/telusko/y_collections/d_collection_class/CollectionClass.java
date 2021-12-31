package com.learning.corejava.telusko.y_collections.d_collection_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(01);
        values.add(53);
        values.add(34);
        values.add(30);

        Collections.sort(values);
        Collections.reverse(values);
        Collections.shuffle(values);


        for (Integer value:values) {
            System.out.println(value);
        }


    }
}
