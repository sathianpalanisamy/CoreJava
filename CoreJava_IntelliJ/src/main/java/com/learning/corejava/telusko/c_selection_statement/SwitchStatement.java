package com.learning.corejava.telusko.c_selection_statement;

public class SwitchStatement {

    public static void main(String[] args) {

        int num1 = 10;

        // float and double values are not supported in switch statement

        switch (num1){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("Not Matching");
        }

    }
}
