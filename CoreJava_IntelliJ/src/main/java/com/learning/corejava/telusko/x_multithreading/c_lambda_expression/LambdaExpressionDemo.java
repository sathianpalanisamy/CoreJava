package com.learning.corejava.telusko.x_multithreading.c_lambda_expression;

public class LambdaExpressionDemo {

    public static void main(String[] args) throws InterruptedException {

//        Runnable r1 =new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<5;i++){
//                    System.out.println("Hello");
//                }
//            }
//        };

//        Runnable r2 =new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<5;i++){
//                    System.out.println("Hi");
//                }
//            }
//        };

//        Runnable r1 =() ->{
//            for(int i=0;i<5;i++){
//                    System.out.println("Hello");
//                }
//        };
//
//
//        Runnable r2 =() ->{
//                for(int i=0;i<5;i++) {
//                    System.out.println("Hi");
//                }
//        };

        Thread t1 =new Thread(() ->{
            for(int i=0;i<5;i++){
                System.out.println("Hello "+Thread.currentThread().getPriority());
                try { Thread.sleep(1000); }catch (Exception e){ }
            }
        });
        Thread t2 =new Thread(() ->{
            for(int i=0;i<5;i++) {
                System.out.println("Hi");
                try { Thread.sleep(1000); }catch (Exception e){ }
            }
        });

        t1.setName("HiThread");
        t2.setName("HelloThread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println(t1.getName()+" "+t1.getPriority());
        System.out.println(t2.getName()+" "+t2.getPriority());

        t1.start();
        try { Thread.sleep(500); }catch (Exception e){ }
        t2.start();

        t1.join();
        t2.join();


        System.out.println(t1.isAlive());

        System.out.println("Bye");


    }
}
