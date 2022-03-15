package com.roitraining.cert.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolRacer {
    public static void main(String[] args) {
        BadLapCounter counter = new BadLapCounter();
        ExecutorService service = null;
        int processorCount = 0; //notice the trick to get the processor count:
        processorCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Processor count: " + processorCount);
        int threadCount = (processorCount%2==0)?processorCount/2: 1;
        List<Future<Integer>> dogFutures = null; //will contain results
        try { //going to try and set a pool for 50% of them, running a dog each
            System.out.println("Creating thread pool sized: " + threadCount);
            service = Executors.newFixedThreadPool(threadCount);
            System.out.println("Prep the dogs");
            List<CallableGreyhound> hounds = new ArrayList<>();
            for (int i = 0; i < threadCount; i++) {
                //hounds.add(new CallableGreyhound("Dog" + (i+1)));
                hounds.add(new CallableGreyhound("Dog" + (i+1), counter));
            } //creating a list of callables, then invoking them all
            dogFutures = service.invokeAll(hounds);
        } catch (InterruptedException e) {
            System.err.println("Threading blew up: " + e);
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
//        try {
//            for(int i = 0; i<dogFutures.size(); i++) {
//                Future<Integer> future = dogFutures.get(i);
//                System.out.printf("Dog %s did %s laps.%n", i, future.get());
//            }
//        } catch (InterruptedException | ExecutionException e) {
//            System.err.println("Problem processing results " + e);
//            e.printStackTrace();
//        }
        int lapCount = dogFutures.stream().mapToInt(f -> {
            try {
                return f.get();
            } catch (InterruptedException | ExecutionException e) {
                System.err.println("Problem processing results " + e);
                e.printStackTrace();
            }
            return 0;
        }).sum();
        System.out.printf("Dogs say they did a total of %s laps%n", lapCount);
        System.out.printf("Lapcounter says a total of %s laps were run%n", counter.getTotalLaps());

    }
}
