package com.learning.corejava.telusko.q_wrapperclass;

public class WrapperClassDemo {
    public static void main(String[] args) {

        int i = 10;

        Integer value = Integer.valueOf(i); // boxing
        int j = value.intValue();  // unboxing

        Integer value2 = 10;  // autoboxing
        int k= value2;        // auto unboxing


        String str = "123";
        int l= Integer.parseInt(str);
        System.out.println(l);



    }
}
