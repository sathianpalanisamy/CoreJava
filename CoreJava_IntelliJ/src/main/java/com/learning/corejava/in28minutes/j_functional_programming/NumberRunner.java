package com.learning.corejava.in28minutes.j_functional_programming;

import java.util.List;

public class NumberRunner {
    public static void main(String[] args) {
        List<Integer> nos = List.of(1,7,10,13,12);

//        printSumOfNumbers(nos);
//        printSumOfOddNumbers(nos);
        printSumOfEvenNumbers(nos);
    }

    private static void printSumOfEvenNumbers(List<Integer> nos) {
        int sum = nos.stream().filter(n->n%2==0).reduce(0,(n1,n2)->{
            System.out.println(n1+" "+n2);
           return n1+n2;
        });
        System.out.println(sum);
    }

    private static void printSumOfOddNumbers(List<Integer> nos) {
        int sum = nos.stream().filter(n->n%2!=0).reduce(0,(integer, integer2) -> integer+integer2);
        System.out.println(sum);
    }

    private static void printSumOfNumbers(List<Integer> nos) {
        int sum = nos.stream().reduce(0,(number1,number2)->number1+number2);
        System.out.println(sum);
    }
}
