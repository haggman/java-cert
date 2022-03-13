package com.roitraining.cert.core;

import java.util.Arrays;

public class ArraysCompare {
    public static void main(String[] args) {
        prt(Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2, 5})); //-1
        prt(Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2, 3})); //0
        prt(Arrays.compare(new int[]{1, 3, 2}, new int[]{1, 2, 3})); //1
        prt("---");
        prt(Arrays.compare(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3})); //1
        prt(Arrays.compare(new int[]{1, 2, 3 ,4}, new int[]{1, 3, 2})); //-1
    }
    static void prt(Object o){
        System.out.println(o);
    }
}

