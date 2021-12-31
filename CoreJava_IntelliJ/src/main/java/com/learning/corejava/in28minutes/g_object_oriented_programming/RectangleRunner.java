package com.learning.corejava.in28minutes.g_object_oriented_programming;

import java.util.Scanner;

class Rectangle{

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea(){
        return length*width;
    }

    public int calculatePerimeter(){
        return 2*(length*width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

public class RectangleRunner {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,20);

        System.out.println(rectangle);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        rectangle.setLength(30);
        System.out.println(rectangle);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());



    }
}
