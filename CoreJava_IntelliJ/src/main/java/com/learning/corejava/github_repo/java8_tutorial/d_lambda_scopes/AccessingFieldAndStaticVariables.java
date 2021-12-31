package com.learning.corejava.github_repo.java8_tutorial.d_lambda_scopes;

import com.learning.corejava.github_repo.java8_tutorial.c_funtional_interface.Converter;

public class AccessingFieldAndStaticVariables {
    int outerNum=10;
    static int staticOuterNum =10;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            staticOuterNum = 72;
            return String.valueOf(from);
        };
    }

    public static void main(String[] args) {

        int i =10;

        Converter<Integer,String> integerStringConverter =(from)->{
            staticOuterNum =10;
            return String.valueOf(from+staticOuterNum);
        };
        System.out.println(integerStringConverter.convert(10));
    }
}
