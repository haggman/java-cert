package com.roitraining.cert.classes_and_objects;

import java.util.Random;

public class StringBuilding {
    public static void main(String[] args) {
        String baseS = "Hello:";
        Random rand = new Random();
        long start = System.nanoTime();
        for(int i = 0;i<10;i++) baseS += rand.nextInt(100) + ", ";
        long timing = System.nanoTime()-start;
        System.out.println(baseS + "time: " + timing);
        //Hello:12, 52, 11, 98, 34, 73, 42, 57, 67, 63, time: 24251553
        StringBuilder sBuilder = new StringBuilder("Hello:");
        //StringBuffer also works, but is thread safe and slower
        start = System.nanoTime();
        for(int i = 0;i<10;i++)sBuilder.append(rand.nextInt(100)).append(", ");
        timing = System.nanoTime()-start;
        System.out.println(sBuilder + " time: " + timing);
        //Hello:22, 73, 36, 8, 52, 99, 1, 46, 80, 13,  time: 23979
    }
}
