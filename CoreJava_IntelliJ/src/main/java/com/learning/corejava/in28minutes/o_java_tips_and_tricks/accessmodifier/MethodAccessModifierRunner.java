package com.learning.corejava.in28minutes.o_java_tips_and_tricks.accessmodifier;


public class MethodAccessModifierRunner {
    public static void main(String[] args) {

        ExampleClass exampleClass =new ExampleClass();
        exampleClass.defaultMethod();
        exampleClass.protectedMethod();
        exampleClass.publicMethod();

    }
}
