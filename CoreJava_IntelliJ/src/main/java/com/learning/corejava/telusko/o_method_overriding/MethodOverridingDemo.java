package com.learning.corejava.telusko.o_method_overriding;

class A{

    int i;

    public void show(){
        System.out.println("in A "+i);
    }

}

class B extends A{

    int i;
    @Override
    public void show(){
        i =8;
        super.i=10;
        super.show();
        System.out.println("in B "+i);
    }

}

class C extends A{

    public void show(){
        System.out.println("in C");
    }

    public void config(){
        System.out.println("in C");
    }
}

public class MethodOverridingDemo {

    public static void main(String[] args) {

        A obj = new B();
        obj.show();      //Run Time Polymorphism

        obj =new C();
        obj.show();      //dynamic method dispatch
//        obj.config();

    }
}
