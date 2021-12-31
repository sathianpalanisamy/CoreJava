package com.learning.corejava.telusko.b_arithmetic_operator;

public class ArithmeticOperator {

    /*
    Arithmetic =>  +,-,*,%,/
    Bitwise
    Relational
    Logical
     */

    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 7;

        int add = num1 + num2;
        int sub = num1 - num2;
        int multiply = num1 * num2;
        int div = num1 / num2;
        double div2 =(double) num1/num2;
        int rem = num1 % num2;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(multiply);
        System.out.println(div);
        System.out.println(div2);
        System.out.println(rem);

        // Shortened Operator

        num1+=1; //num1 =num1 + 1;
        System.out.println(num1);

        // Increment and decrement operator

//        ++num1;  //pre increment
//        num1++;  //post increment


//        num2 =++num1;
        num2 =num1++;

        System.out.println(num2);
        System.out.println(num1);

    }
}
