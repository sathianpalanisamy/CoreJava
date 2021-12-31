package com.learning.corejava.in28minutes.j_functional_programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperation {
    public static void main(String[] args) {
        List<Integer> values = List.of(10,20,2,4,6,7);

        int max = values.stream().max((o1, o2) -> Integer.compare(o1,o2)).get();
        System.out.println(max);

        int min = values.stream().min((o1, o2) -> Integer.compare(o1,o2)).get();
        System.out.println(min);

        int sum =IntStream.range(1,11).reduce(0,(n1,n2)->n1+n2);
        System.out.println(sum);


        List<Integer> odd =values.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(odd);

        List<Integer> even =values.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> squareOfNumbers =IntStream.range(1,11).map(a->a*a).boxed().collect(Collectors.toList());
        System.out.println(squareOfNumbers);
    }
}
