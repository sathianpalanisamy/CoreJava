package com.learning.corejava.in28minutes.k_threads;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {

    private final String name;

    public CallableTask(String name){
        this.name=name;
    }

    @Override
    public String call() throws Exception {
        return "Welcome "+name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> sathian = executorService.submit(new CallableTask("Sathian"));
        System.out.println("Callabe Task Completed");
        String message =sathian.get();
        System.out.println(message);
        System.out.println("Main Completed");
        executorService.shutdown();

    }
}
