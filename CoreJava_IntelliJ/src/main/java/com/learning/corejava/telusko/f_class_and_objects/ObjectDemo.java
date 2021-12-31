package com.learning.corejava.telusko.f_class_and_objects;

class Calculator{

    int num1;
    int num2;
    int result;

    void perform()
    {
        result = num1+num2;
    }


}

public class ObjectDemo {

    public static void main(String[] args) {

        Calculator calculator=new Calculator();
        calculator.num1 = 10;
        calculator.num2 = 20;
        calculator.perform();

        System.out.println(calculator.result);

    }
}
