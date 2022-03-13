package com.roitraining.cert.core;

import java.util.Arrays;
import java.util.Random;

public class ArrayFilling {
    public static void main(String[] args) {
        Random rGenerator = new Random();
        int luckyNumbers[] = new int[7];
        int randNumbers[] = new int[10];
        Arrays.fill(luckyNumbers, 13);
        System.out.println(luckyNumbers); //[I@5a39699c (or similar hex hash)
        System.out.println(Arrays.toString(luckyNumbers)); //[13, 13, 13, 13, 13, 13, 13]
        Arrays.setAll(randNumbers, index-> rGenerator.nextInt(100));
        System.out.println(Arrays.toString(randNumbers));//[51, 27, 71, 93, 5, 95, 42, 73, 96, 34]
        Arrays.sort(randNumbers);
        System.out.println(Arrays.toString(randNumbers));//[5, 27, 34, 42, 51, 71, 73, 93, 95, 96]
    }
}
