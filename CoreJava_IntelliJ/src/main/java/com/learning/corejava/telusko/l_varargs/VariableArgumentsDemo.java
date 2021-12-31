package com.learning.corejava.telusko.l_varargs;

class Calculator{

    public int add(int ... nums){
        int sum = 0;
        for (int n:nums) {
            sum = sum +n;
        }
        return  sum;
    }
}

public class VariableArgumentsDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(10,2,3,4,5);
        System.out.println(result);

    }
}
