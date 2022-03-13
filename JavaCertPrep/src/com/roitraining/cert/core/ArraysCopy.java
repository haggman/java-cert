package com.roitraining.cert.core;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int[] numsCp1, numsCp2, numsCp3, numsCp4;
        numsCp1 = Arrays.copyOf(nums,nums.length);
        System.out.println(Arrays.toString(numsCp1));//[1, 2, 3]
        numsCp2 = Arrays.copyOf(nums, 5);
        System.out.println(Arrays.toString(numsCp2));//[1, 2, 3, 0, 0]
        numsCp3 = Arrays.copyOfRange(numsCp2,1,3);//[from, to)
        System.out.println(Arrays.toString(numsCp3));//[2, 3]
        numsCp4 = Arrays.copyOfRange(nums,1,4);//[from, to)
        System.out.println(Arrays.toString(numsCp4));//[2, 3, 0]
    }
}
