package com.roitraining.cert.concurrency;

import com.roitraining.cert.shared.Dog;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableGreyhound extends Dog implements Callable<Integer> {
    BadLapCounter counter = new BadLapCounter();
    public CallableGreyhound(String name) {
        super(name);
    }

    public CallableGreyhound(String name, BadLapCounter counter) {
        super(name);
        this.counter = counter;
    }

    @Override
    public Integer call() throws Exception {
        Random rand = new Random();
        int lapCount = rand.nextInt(10);
        int completedLaps = 0;
        try {
            System.out.printf("Hound %s is off!%n", getName());
            for (int i = 0; i < lapCount; i++) {
                System.out.printf("%s doing lap %s%n", getName(), i + 1);
                counter.incrementCount();
                //sleep time is in ms
                Thread.sleep(rand.nextInt(2000));
                completedLaps++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return completedLaps;
    }
}
