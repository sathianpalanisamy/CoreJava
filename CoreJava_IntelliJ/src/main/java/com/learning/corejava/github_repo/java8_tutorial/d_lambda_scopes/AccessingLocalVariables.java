package com.learning.corejava.github_repo.java8_tutorial.d_lambda_scopes;

import com.learning.corejava.github_repo.java8_tutorial.c_funtional_interface.Converter;

public class AccessingLocalVariables {
    public static void main(String[] args) {
//        final int i = 10;
        int i = 10;
        Converter<Integer,String> integerStringConverter =(a)->String.valueOf(a+i);
        System.out.println(integerStringConverter.convert(10));

//        i=10; //not allowed
    }
}