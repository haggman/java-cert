package com.roitraining.cert.core;

import java.util.Arrays;

public class ArraysMismatch {
    public static void main(String[] args) {
        prt(Arrays.mismatch(new int[]{1, 2, 3}, new int[]{1, 2, 5})); //2
        prt(Arrays.mismatch(new int[]{1, 2, 3}, new int[]{1, 2, 3})); //-1
        prt(Arrays.mismatch(new int[]{1, 3, 2}, new int[]{1, 2, 3})); //1
    }
    static void prt(Object o){
        System.out.println(o);
    }
}
