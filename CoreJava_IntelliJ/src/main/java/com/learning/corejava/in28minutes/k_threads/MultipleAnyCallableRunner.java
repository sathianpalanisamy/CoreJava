package com.learning.corejava.in28minutes.k_threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> callableTasks = List.of(new CallableTask("Sathian"), new CallableTask("Saravana"), new CallableTask("Sanjay"));

        String value = executorService.invokeAny(callableTasks);
        System.out.println(value);
        executorService.shutdown();
    }
}
