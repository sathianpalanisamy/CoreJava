package com.learning.corejava.telusko.g_constructor;

class Casino{

    int num1;
    int num2;
    String operation;

     Casino(){
        num1 =0;
        num2 =0;
    }

    Casino(int num1){
        this.num1 = num1;
        num2 =0;
    }

    Casino(int num1,int num2){
        this.num1 = num1;
        this.num2 =num2;
    }

    Casino(int num1,int num2,String op){
        this.num1 = num1;
        this.num2 =num2;
        operation = op;
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Casino casino = new Casino(10,20,"op");

        new Casino();

    }
}
