package com.learning.corejava.amigoscode.functional_programming.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // Function takes 1 argument and produces 1 result

        int increment = incrementByOne(1);
        System.out.println(increment);

        Integer increment1 = incrementByOneFunction.apply(1);
        System.out.println(increment1);

        Integer multiply = multiplyBy100Function.apply(increment1);
        System.out.println(multiply);

        Integer incrementByOneAndMultiplyBy100 = incrementByOneFunction.andThen(multiplyBy100Function).apply(1);
        System.out.println(incrementByOneAndMultiplyBy100);

        // BiFunction takes 2 argument and produces 1 result

        System.out.println(
                incrementByOneAndMultiplyBy(1,100)
        );

        System.out.println(
                incrementByOneAndMultiplyByFunction.apply(1,100)
        );


    }

    static Function<Integer,Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer,Integer> multiplyBy100Function = number -> number * 100;

    static int incrementByOne(int number){
        return ++number;
    }

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyByFunction =
            (number,numberToMultiply) ->(++number)*numberToMultiply;

    static int incrementByOneAndMultiplyBy(int number,int numToMultiplyBy){
        return (++number)*numToMultiplyBy;
    }
}
