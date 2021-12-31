package com.learning.corejava.telusko.t_interface.c_multiple_inheritance_issue_with_Interface;

interface Demo{
    void abc();

    default void display(){
        System.out.println("in Demo Display");
    }

}

interface MyDemo{
    default void display(){
        System.out.println("in Demo Display");
    }

}

class Implementer implements Demo,MyDemo{

    @Override
    public void abc() {
        System.out.println("in abc");

    }

    @Override
    public void display() {
        MyDemo.super.display();
//        System.out.println("display implementation");

    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Demo obj = new Implementer();
        obj.display();
        obj.abc();


    }


}
