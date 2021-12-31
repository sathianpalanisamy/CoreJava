package com.learning.corejava.telusko.t_interface.b_anonymousclass;

@FunctionalInterface
interface Demo{

    void abc();

    default void show(){
        System.out.println("in show");
    }
}

class DemoImpl implements Demo{

    @Override
    public void abc() {
        System.out.println("in abc");

    }

    @Override
    public void show() {
        System.out.println("in new show");
    }
}

public class DefaultInterface {

    public static void main(String[] args) {
        Demo ref = new DemoImpl();
        ref.abc();
        ref.show();
    }
}
