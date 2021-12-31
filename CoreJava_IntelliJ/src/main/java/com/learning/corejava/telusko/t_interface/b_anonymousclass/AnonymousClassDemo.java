package com.learning.corejava.telusko.t_interface.b_anonymousclass;

class A{
    public void show(){
        System.out.println("in show");
    }
    public void test(){
        System.out.println("in show");
    }
}

public class AnonymousClassDemo {

    public static void main(String[] args) {

        A ref =new A(){
            public void show(){
                System.out.println("i am best");
            }

            public void test(){
                System.out.println("in test");
            }
        };
        ref.test();

    }
}
