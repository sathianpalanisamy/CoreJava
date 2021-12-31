package com.learning.corejava.telusko.p_encapsulation;

class Student{

    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        System.out.println("value of roll no changed");
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("sathian");
        student.setRollNo(1);

        System.out.println(student.getName());
        System.out.println(student.getRollNo());
    }
}
