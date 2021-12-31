package com.learning.corejava.telusko.t_interface.a_InterfaceDemo;

interface Abc{

    void show();
}

class Implementor implements Abc{

    @Override
    public void show() {
        System.out.println("in show");
    }
}

/*
  Type of Interface
    - Normal Interface
    - Single abstract method interface -> functional interface
    - Marker Interface
    -


 */

public class InterfaceDemo {
    public static void main(String[] args) {

        Abc ref = new Implementor();
        ref.show();

    }
}
