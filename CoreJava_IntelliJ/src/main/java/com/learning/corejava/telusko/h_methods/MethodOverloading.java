package com.learning.corejava.telusko.h_methods;

class Casino{

    void add(int i,int j){
        System.out.println(i+j);
    }

    void add(int i,int j,int k){
        System.out.println(i+j+k);
    }

    void add(int i,double j){
        System.out.println(i+j);
    }
}
public class MethodOverloading {

    public static void main(String[] args) {

        Casino casino = new Casino();
        casino.add(10,20);
        casino.add(10,4.5);
        casino.add(10,20,30);


    }
}
