package com.learning.corejava.in28minutes.j_functional_programming;

import java.util.List;

public class IntermediateOperationRunner {
    public static void main(String[] args) {
        List<Integer> nos = List.of(10,5,12,5,6,9,12);

        // sorting

//        nos.stream().sorted().forEach(a-> System.out.println(a));

        //distinct

//        nos.stream().distinct().sorted().forEach(e-> System.out.println(e));

        //map

        nos.stream().distinct().sorted((n1,n2)->Integer.compare(n2,n1)).map(n->n*n).forEach(e-> System.out.println(e));
    }
}
