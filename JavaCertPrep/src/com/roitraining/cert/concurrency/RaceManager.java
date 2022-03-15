package com.roitraining.cert.concurrency;

public class RaceManager {
    public static void main(String[] args) {
        var dog1 = new Greyhound("Lenny");
        var dog2 = new Greyhound("Chatty");

        System.out.println("On the mark, get set, go");
        //Notice! We don't call run directly. The JVM
        //spawns a new thread, and once it's setup, then
        //the JVM calls run for us.
        new Thread(dog1).start();
        new Thread(dog2).start();
        System.out.println("All done.");
    }
}
