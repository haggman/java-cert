package com.roitraining.cert.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleDogRacer {
    public static void main(String[] args) {
        //Simply executes the threads one at a time, in this order
        ExecutorService oneAtATime = Executors.newSingleThreadExecutor();
        System.out.println("Starting the threads");
        oneAtATime.execute(new Greyhound("First Dog"));
        oneAtATime.execute(()-> System.out.println("Something Basic"));
        oneAtATime.execute(new Greyhound("Second Dog"));
        oneAtATime.shutdown(); //If you don't shut it down, your app hangs
        System.out.println("Threads are off, doing their thing. I'm not waiting...");
    }
}
