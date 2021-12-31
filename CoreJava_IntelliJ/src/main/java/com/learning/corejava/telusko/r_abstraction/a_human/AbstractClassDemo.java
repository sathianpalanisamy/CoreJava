package com.learning.corejava.telusko.r_abstraction.a_human;

abstract class Human{

    public abstract void eat();

    public  void walk() {
    }
}

class Man extends Human{

    @Override
    public void eat() {

    }
}


public class AbstractClassDemo {

    public static void main(String[] args) {

        Human human = new Man();

    }
}
