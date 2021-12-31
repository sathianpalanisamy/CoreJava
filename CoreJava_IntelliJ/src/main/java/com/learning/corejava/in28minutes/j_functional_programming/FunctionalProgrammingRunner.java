package com.learning.corejava.in28minutes.j_functional_programming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {

        List<String> words = List.of("Apple", "Bat", "Cat", "Dog");

//        printBasic(words);
//        printFunctional(words);
//        printBasicWithFilter(words);
//        printFunctionalWithFilter(words);
        List<Integer> value = List.of(10,5,7,3,2,20);

//        printFunctionalWithEvenNumber(value);
        printFunctionalWithOddNumber(value);



    }

    private static void printFunctionalWithOddNumber(List<Integer> value) {
        value.stream().filter(a-> a%2==1).forEach(a-> System.out.println(a));
    }

    private static void printFunctionalWithEvenNumber(List<Integer> value) {
        value.stream().filter(a-> a%2==0).forEach(a-> System.out.println(a));
    }

    private static void printFunctionalWithFilter(List<String> words) {

        words.stream().filter(a->a.endsWith("at")).forEach(a-> System.out.println(a));
    }

    private static void printFunctional(List<String> words) {
        words.stream().forEach(element -> System.out.println(element));
    }

    private static void printBasicWithFilter(List<String> words) {
        for (String word : words) {
            if (word.endsWith("at"))
                System.out.println(word);
        }
    }

    private static void printBasic(List<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
