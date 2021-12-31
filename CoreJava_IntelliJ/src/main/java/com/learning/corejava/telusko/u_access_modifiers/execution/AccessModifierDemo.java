package com.learning.corejava.telusko.u_access_modifiers.execution;


/*
Access Modifiers -> final, abstract, private, public, protected

private - specific class
default - specific package
public - any class or package
protected - subsiding class

 - class
     -> Allowed modifiers - final, abstract, public
     ->  private and protected are not allowed
 - Variables
     -> Allowed modifiers - final, public, private, protected


 */

import com.learning.corejava.telusko.u_access_modifiers.test.Student;

public class AccessModifierDemo {

    public static void main(String[] args) {

        Student s = new Student();
        s.rollNo = 9;


    }
}
