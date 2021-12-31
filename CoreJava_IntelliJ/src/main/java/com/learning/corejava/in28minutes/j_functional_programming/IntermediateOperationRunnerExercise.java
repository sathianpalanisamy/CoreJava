package com.learning.corejava.in28minutes.j_functional_programming;

import java.util.List;
import java.util.stream.IntStream;

public class IntermediateOperationRunnerExercise {
    public static void main(String[] args) {

        //        IntStream.range(1,11).map(a->a*a).forEach(a-> System.out.println(a));


        List<String> words =List.of("Cat","Bat","Dog");
        words.stream().map(a->a.toLowerCase()).forEach(a-> System.out.println(a));

        words.stream().map(a->a+" "+a.length()).forEach(a-> System.out.println(a));


    }
}
