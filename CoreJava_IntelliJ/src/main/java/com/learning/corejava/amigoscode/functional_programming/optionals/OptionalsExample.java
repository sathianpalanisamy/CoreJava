package com.learning.corejava.amigoscode.functional_programming.optionals;

import java.util.Optional;

public class OptionalsExample {
    public static void main(String[] args) {

//        Object o = Optional.ofNullable("Hello").orElseGet(() -> "Default");

//        Object o = Optional.ofNullable(null).orElseThrow(()->new IllegalStateException("EXCEPTION"));
//        System.out.println(o);

//        Optional.ofNullable("Hello").ifPresent(value->{
//            System.out.println(value);
//        });

        Optional.ofNullable(null).ifPresentOrElse(value->
            System.out.println("V"),
                () -> System.out.println("bbb")
        );
    }
}
