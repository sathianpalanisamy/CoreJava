package com.learning.corejava.in28minutes.k_threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableTask> callableTasks = List.of(new CallableTask("Sathian"), new CallableTask("Saravana"), new CallableTask("Sanjay"));

        List<Future<String>> futures = executorService.invokeAll(callableTasks);
        for (Future<String> value:futures) {
            System.out.println(value.get());
        }
        executorService.shutdown();
    }
}
