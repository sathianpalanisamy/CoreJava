package com.learning.corejava.telusko.t_interface.b_anonymousclass;

@FunctionalInterface
interface Abc{

    void show();
}


public class AnonymousClassWithFuntionalInterface {
    public static void main(String[] args) {

        Abc ref = new Abc() {
            @Override
            public void show() {
                System.out.println("in display");
            }
        };
        ref.show();

        // Lambda expression

        Abc abc = () ->{
            System.out.println("functional demo");
        };
        abc.show();

    }
}