package com.learning.corejava.in28minutes.k_threads;

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("\nTask 1 is started");
        for (int i=100;i<199;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nTask 1 is completed");
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("\nTask 2 is started");
        for (int i=200;i<299;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nTask 2 is completed");
    }
}

public class ThreadBasicRunner {

    /*
    State of Thread
      - NEW
      - RUNNABLE
      - RUNNING
      - BLOCKED/WAITING
      - DEAD
     */

    public static void main(String[] args) throws InterruptedException {

        //Task1
        System.out.println("\nTask 1 is kicked off");
        Task1 task1 = new Task1();
        task1.setPriority(Thread.MAX_PRIORITY);
        task1.start();

        Thread.sleep(10000);
        Thread.yield();


        //Task2
        System.out.println("\nTask 2 is kicked off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        //waiting for task1 and  to complete
        task1.join();
        task2Thread.join();
        //Task3
        System.out.println("\nTask 3 is kicked off");
        for (int i=300;i<399;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nTask 3 is completed");

        System.out.println("Main Done");

    }
}
