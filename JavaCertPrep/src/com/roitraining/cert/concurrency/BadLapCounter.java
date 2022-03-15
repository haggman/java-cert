package com.roitraining.cert.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BadLapCounter {
    private int lapCount = 0;
    //Fixing with an atomic integer
    //private AtomicInteger betterLapCount = new AtomicInteger(0);
    //Fixing with a Lock
    Lock lock = new ReentrantLock(true); //use fair sharing
    //could slip a synchronized keyword between public and void, not recommended
    public void incrementCount(){
        //fix with a Lock
        lock.lock();
        //the classic fix. Make sure the threads are using the same monitor object
       // synchronized (this) {
            lapCount = lapCount + 1;
       // }
        //betterLapCount.incrementAndGet();
        lock.unlock();
    }
    public int getTotalLaps(){
        //return betterLapCount.get();
        return lapCount;
    }
}
