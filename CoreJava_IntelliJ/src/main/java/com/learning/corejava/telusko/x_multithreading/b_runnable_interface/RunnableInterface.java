package com.learning.corejava.telusko.x_multithreading.b_runnable_interface;

class Hi implements Runnable{

    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Hi");
            try { Thread.sleep(1000); }catch (Exception e){ }
        }
    }

}

class Hello implements Runnable{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Hello");
            try { Thread.sleep(1000); }catch (Exception e){ }
        }
    }

}

public class RunnableInterface {

    public static void main(String[] args) {

        Runnable obj1 =  new Hello();
        Runnable obj2 = new Hi();

        Thread t1 =new Thread(obj1);
        Thread t2 =new Thread(obj2);

        t1.start();
        try { Thread.sleep(500); }catch (Exception e){ }
        t2.start();

    }
}
