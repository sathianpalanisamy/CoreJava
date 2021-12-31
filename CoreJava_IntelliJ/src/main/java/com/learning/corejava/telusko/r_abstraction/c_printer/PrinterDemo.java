package com.learning.corejava.telusko.r_abstraction.c_printer;

abstract class Writer{

    public abstract void write();
}

class Pen extends Writer{

    @Override
    public void write() {

        System.out.println("in pen");

    }
}

class Pencil extends Writer{

    @Override
    public void write() {

        System.out.println("in pencil");

    }
}

class Kit{

    public void doSomething(Writer writer){

        writer.write();
    }
}


public class PrinterDemo {
    public static void main(String[] args) {

        Writer pen = new Pen();

        Writer pencil = new Pencil();


        Kit kit =new Kit();
        kit.doSomething(pencil);



    }
}
