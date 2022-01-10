package com.learning.corejava.hackerankproblems.object_oriented_programming;

import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class JavaAbstractClass {
    public static void main(String[] args) {

        try(Scanner scn = new Scanner(System.in)) {
            String title = scn.nextLine();
            MyBook myBook = new MyBook();
            myBook.setTitle(title);
            System.out.println("The title is: "+myBook.getTitle());
        }

    }
}
