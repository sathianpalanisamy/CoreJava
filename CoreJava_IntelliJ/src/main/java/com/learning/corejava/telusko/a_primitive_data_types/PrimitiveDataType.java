package com.learning.corejava.telusko.a_primitive_data_types;

public class PrimitiveDataType {
    public static void main(String[] args) {
        int number = 2_147_483_647;    // 4 bytes -> 32 bits -> -2147483648 to 2147483647
        number = 8;
        number = (int) 7.5;    // Type Casting
        System.out.println(number);
        byte b = 5;   // 1 bytes -> -128 to 127
        short s = 5;   // 2 bytes -> -32,768 to 32,767
        long l = 5000000000l;    //8 bytes


        float percent1= 4.5f;   // 4 bytes
        double percent = 4.5;   // 8 bytes

        percent = 7;    //implicit conversion
        System.out.println(percent);

        char c = 'A';
        c=66;
        System.out.println(c);


    }
}
