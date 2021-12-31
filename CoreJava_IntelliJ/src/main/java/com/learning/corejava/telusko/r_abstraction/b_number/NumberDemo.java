package com.learning.corejava.telusko.r_abstraction.b_number;

class A{
    public void show(Number i){
        System.out.println(i);
    }
}

public class NumberDemo {
    public static void main(String[] args) {

        A a = new A();
        a.show(10.4);
        a.show(10);

    }
}
