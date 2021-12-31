package com.learning.corejava.github_repo.java8_tutorial.e_built_in_funtional_interface;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("123");
    }
}
