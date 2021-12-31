package com.learning.corejava.amigoscode.functional_programming.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        System.out.println(getConnectionUrl());

        System.out.println(getConnectionUrlBySupplier.get());

    }

    static Supplier<List<String>> getConnectionUrlBySupplier =
            () -> List.of("jdbc:mysql://localhost:3306/sakila");

    static String getConnectionUrl(){
        return "jdbc:mysql://localhost:3306/sakila";
    }
}
