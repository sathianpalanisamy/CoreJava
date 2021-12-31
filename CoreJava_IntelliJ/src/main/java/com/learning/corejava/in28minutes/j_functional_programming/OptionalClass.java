package com.learning.corejava.in28minutes.j_functional_programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;


public class OptionalClass {
    public static void main(String[] args) {
        List<Integer> values =List.of(101,201,19);

        Optional<Integer> max=values.stream().filter(n->n%2==0).max((n1, n2)->Integer.compare(n1,n2));
        System.out.println(max);
        System.out.println(max.isPresent());
        System.out.println(max.orElse(0));


    }
}
