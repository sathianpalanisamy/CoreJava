package com.learning.corejava.in28minutes.n_concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter{
    private int i = 0;

    public synchronized void increment(){
        i++;
        //get the value
        // increment
        //assign
    }

    public int getI() {
        return i;
    }
}

/*
 Only one thread can be executed any one of the synchronized method even though
 methods are independent
 */
class BiCounter{
    private int i = 0;
    private int j = 0;

    public synchronized void incrementI(){
        i++;
        //get the value
        // increment
        //assign
    }

    public int getI() {
        return i;
    }

    public synchronized void incrementJ(){
        j++;
        //get the value
        // increment
        //assign
    }

    public int getJ() {
        return j;
    }
}


class BiCounterWithLock{
    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    public  void incrementI(){
        lockForI.lock();  //get the lock
        i++;
        lockForI.unlock(); //release the lock
    }

    public int getI() {
        return i;
    }

    public  void incrementJ(){
        lockForJ.lock();  //get the lock
        j++;
        lockForJ.unlock(); //release the lock
    }

    public int getJ() {
        return j;
    }
}

class BiCounterWithAtomicInteger{
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();


    public  void incrementI(){
        i.incrementAndGet();
    }

    public int getI() {
        return i.get();
    }

    public  void incrementJ(){
        j.incrementAndGet();
    }

    public int getJ() {
        return j.get();
    }
}

public class ConcurrencyRunner {
    public static void main(String[] args) {

        Counter counter = new Counter();
        counter.increment();
        counter.increment();

        System.out.println(counter.getI());

    }
}
