package com.learning.corejava.telusko.m_inheritence;

class Calculator{

    public int add(int i, int j){
        return  i+j;
    }
}

class AdvanceCalculator extends Calculator{

    public int sub(int i, int j){
        return  i-j;
    }
}

class VeryAdvanceCalculator extends AdvanceCalculator{

    public int multiply(int i,int j){
        return i*j;
    }
}

public class InheritenceDemo {

    public static void main(String[] args) {

        VeryAdvanceCalculator calculator = new VeryAdvanceCalculator();
        int add = calculator.add(10,20);
        int sub = calculator.sub(10,20);
        int mul = calculator.multiply(10,20);


        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);


    }
}
