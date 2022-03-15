package com.roitraining.cert.concurrency;

import java.util.List;

public class ParallelFun {
    public static void main(String[] args) {
        List.of(new CallableGreyhound("Dog1"), new CallableGreyhound("Dog2"),
                new CallableGreyhound("Dog 3"), new CallableGreyhound("Dog4"))
                //.stream() //this would run in sequence, each dog doing its own laps
                .parallelStream() //this spins off threads, and the dogs are running there
                .map(d -> {       //even though the worker method isn't manually creating
                    try {         //a thread. The stream is handling that
                        return d.call();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return 0;
                }).forEach(System.out::println);
    }
}
