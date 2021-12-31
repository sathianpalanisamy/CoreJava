package com.learning.corejava.telusko.c_selection_statement;

public class TernaryOperator {

    // ?: =>  condition?expression1:expression2
    public static void main(String[] args) {

        int i = 2;
        int j = 0;

//        if(i>5){
//            j=1;
//        }
//        else {
//            j=2;
//        }

        j = (i>5)?1:2;

        System.out.println(j);
    }
}
