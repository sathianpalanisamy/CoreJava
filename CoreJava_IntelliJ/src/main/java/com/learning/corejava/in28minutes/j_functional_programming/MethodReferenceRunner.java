package com.learning.corejava.in28minutes.j_functional_programming;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferenceRunner {
    public static void main(String[] args) {
        List<String> words = List.of("Dog", "Cat", "Elephant");
        words.stream().map(n -> n.length()).forEach(s -> System.out.println(s));

        words.stream().map(String::length).forEach(System.out::println);


        Predicate<Integer> evenPredicate = n -> n % 2 == 0;
        Predicate<Integer> oddPredicate = getOddPredicate();

        Integer max = List.of(10, 2, 3, 5, 8).stream().filter(evenPredicate).max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
        System.out.println("max : "+max);

        Integer maxUsingMethodReference = List.of(10, 2, 3, 5, 8).stream()
                .filter(MethodReferenceRunner::isEven)
                .max(Integer::compare)
                .orElse(0);
        System.out.println("max value is : "+maxUsingMethodReference);


    }

    private static Predicate<Integer> getOddPredicate() {
        return n -> n % 2 == 1;
    }

    public static boolean isEven(Integer no){
        return no%2==0;
    }
}
