package com.learning.corejava.telusko.c_selection_statement;

public class IfElseStatement {

    public static void main(String[] args) {

        int n = 9;

        if(n==0){
            System.out.println("nothing");
        } else if (n%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
