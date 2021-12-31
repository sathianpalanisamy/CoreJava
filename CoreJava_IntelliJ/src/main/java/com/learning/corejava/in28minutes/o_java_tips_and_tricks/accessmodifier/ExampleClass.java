package com.learning.corejava.in28minutes.o_java_tips_and_tricks.accessmodifier;

public class ExampleClass{

    public void publicMethod(){}

    private void privateMethod(){}

    protected void protectedMethod(){}

    void defaultMethod(){}

    public static void main(String[] args) {

        ExampleClass exampleClass =new ExampleClass();
        exampleClass.defaultMethod();
        exampleClass.privateMethod();
        exampleClass.protectedMethod();
        exampleClass.publicMethod();

    }


}