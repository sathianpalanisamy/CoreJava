package com.learning.corejava.telusko.n_super;

class A{

    public A(){
        System.out.println("in A");
    }

    public A(int i){
        System.out.println("in int A");
    }

}

class B extends A{

    public B(){
        super(5);
        System.out.println("in B");
    }

    public B(int i){
        System.out.println("in int B");
    }

}

public class SuperDemo {

    public static void main(String[] args) {

        B a= new B();

    }
}
