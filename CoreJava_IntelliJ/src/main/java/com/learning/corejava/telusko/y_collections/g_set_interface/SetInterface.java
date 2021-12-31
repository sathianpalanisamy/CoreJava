package com.learning.corejava.telusko.y_collections.g_set_interface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

    public static void main(String[] args) {

        System.out.println("Hashset");

        Set<Integer> values = new HashSet<>();
        values.add(10);
        values.add(10);
        values.add(9);
        values.add(8);
        values.add(5);


        for (Integer i:values) {
            System.out.println(i);
        }

        System.out.println("Treeset");

        Set<Integer> nos = new TreeSet<>();
        nos.add(10);
        nos.add(10);
        nos.add(9);
        nos.add(8);
        nos.add(5);

        for (Integer i:nos) {
            System.out.println(i);
        }
    }
}
