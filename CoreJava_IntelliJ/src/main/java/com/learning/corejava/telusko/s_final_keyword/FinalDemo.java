package com.learning.corejava.telusko.s_final_keyword;

final class A{

    final int VALUE;

    public A(){
//        i=10;
        VALUE = 10;
    }

    public final void show(){
        System.out.println("in show");
    }
}

/*

final keyword
  - with variable -> becomes constant
  - with method -> can't override
  - with class -> can't extends
 */

public class FinalDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.VALUE);
    }
}
