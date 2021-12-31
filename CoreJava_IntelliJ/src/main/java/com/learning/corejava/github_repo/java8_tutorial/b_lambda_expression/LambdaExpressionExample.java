package com.learning.corejava.github_repo.java8_tutorial.b_lambda_expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog","tiger","raja","elephant","cat");

//        Collections.sort(words, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

//        Collections.sort(words,(String a,String b)->{
//            return a.compareTo(b);
//        });

//        Collections.sort(words,(a,b)-> a.compareTo(b));

//        Collections.sort(words,String::compareTo);

        words.sort(String::compareTo);

        words.stream().forEach(System.out::println);

    }
}
