package com.learning.corejava.hackerankproblems;

import java.util.regex.Pattern;

public class ValidUserNameRegularExpression {
    public static void main(String[] args) {
        String regex = "[a-zA-Z][\\w_]{7,29}";
        System.out.println(Pattern.compile(regex).matcher("1sathiana").matches());


    }
}
