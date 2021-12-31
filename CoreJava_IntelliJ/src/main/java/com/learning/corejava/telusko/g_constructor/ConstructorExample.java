package com.learning.corejava.telusko.g_constructor;

class Calculator{

    int num1;
    int num2;

    Calculator(){

        num1 = 10;
        num2 = 20;
    }

    Calculator(int num1, int n2){
        this.num1 = num1;
        num2 = n2;

    }

}

public class ConstructorExample {

    public static void main(String[] args) {

        Calculator calculator=new Calculator(21,44);

        System.out.println(calculator.num1);



    }
}
