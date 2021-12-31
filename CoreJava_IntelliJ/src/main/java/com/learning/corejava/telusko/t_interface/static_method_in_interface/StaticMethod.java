package com.learning.corejava.telusko.t_interface.static_method_in_interface;

interface A{

    int num = 0;
    
    static void display(){
        System.out.println("in display");
    }
}

public class StaticMethod {
    public static void main(String[] args) {

        A.display();

    }
}
