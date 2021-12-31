package com.learning.corejava.github_repo.java8_tutorial.e_built_in_funtional_interface;

import java.util.Objects;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate<String> predicate = (p) -> p.startsWith("t");

        System.out.println(predicate.test("sa"));
        System.out.println(predicate.negate().test("sa"));

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

    }
}
