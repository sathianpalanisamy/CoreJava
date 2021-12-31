package com.learning.corejava.telusko.x_multithreading.a_thread_class;

class Hi extends Thread{

    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Hi");
            try { Thread.sleep(1000); }catch (Exception e){ }
        }
    }

}

class Hello extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Hello");
            try { Thread.sleep(1000); }catch (Exception e){ }
        }
    }

}

public class ThreadClass {

    public static void main(String[] args) {

        Hello obj1 =  new Hello();
        Hi obj2 = new Hi();

        obj1.start();
        try { Thread.sleep(500); }catch (Exception e){ }
        obj2.start();

        try {
            obj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            obj2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main");

    }
}
