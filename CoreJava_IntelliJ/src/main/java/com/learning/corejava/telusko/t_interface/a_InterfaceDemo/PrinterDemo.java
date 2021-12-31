package com.learning.corejava.telusko.t_interface.a_InterfaceDemo;

interface Writer{

    void write();
}

class Pen implements Writer{

    @Override
    public void write() {

        System.out.println("in pen");

    }
}

class Pencil implements Writer{

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
