package com.learning.corejava.telusko.x_multithreading.d_sychronized_keyword;

class Counter{
    int count = 0;

    public synchronized void increment(){
        count++;
    }
}

public class SynchronizationExample {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 =new Thread(() ->{
            for (int i=0;i<55;i++){
                System.out.println("1");
                counter.increment();}
        });

        Thread t2 =new Thread(() ->{
            for (int i=0;i<55;i++){
                System.out.println("2");
                counter.increment();}
        });

        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println(counter.count);

    }
}
