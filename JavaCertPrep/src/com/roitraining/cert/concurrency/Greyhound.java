package com.roitraining.cert.concurrency;

import com.roitraining.cert.shared.Dog;

import java.util.Random;

public class Greyhound extends Dog implements Runnable {
    public Greyhound(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random rand = new Random();
        try {
            System.out.printf("Hound %s is off!%n", getName());
            for (int i = 0; i < 10; i++) {
                System.out.printf("%s doing lap %s%n", getName(), i + 1);
                //sleep time is in ms
                Thread.sleep(rand.nextInt(2000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
