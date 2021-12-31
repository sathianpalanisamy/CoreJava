package com.learning.corejava.telusko.j_inner_class;

class Outer{
    int a;
    public void show(){

    }

     class Inner{

        public void display(){
            System.out.println("in display");
        }
    }

    static class InnerStatic{
        public void display(){
            System.out.println("in static class display");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner =outer.new Inner();
        inner.display();


        Outer.InnerStatic innerStatic = new Outer.InnerStatic();
        innerStatic.display();

    }
}
