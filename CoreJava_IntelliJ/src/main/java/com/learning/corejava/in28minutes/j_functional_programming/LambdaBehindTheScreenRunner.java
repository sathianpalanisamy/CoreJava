package com.learning.corejava.in28minutes.j_functional_programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class PredicateEvenNumber implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer%2==0;
    }
}

class ConsumerRunner implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);

    }
}

class MapRunner implements Function<Integer,Integer>{

    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}

public class LambdaBehindTheScreenRunner {
    public static void main(String[] args) {
        List<Integer> values =List.of(10,20,2,11,35);

        values.stream().filter(n->n%2==0).map(n->n*n).forEach(n-> System.out.println(n));

        System.out.println("-------------");

        values.stream().filter(new PredicateEvenNumber()).map(new MapRunner()).forEach(new ConsumerRunner());
    }
}
