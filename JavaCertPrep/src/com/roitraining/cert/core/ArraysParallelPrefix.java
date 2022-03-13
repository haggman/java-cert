package com.roitraining.cert.core;

import java.util.Arrays;

public class ArraysParallelPrefix {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        Arrays.parallelPrefix(nums, (curVal,nextvalue) -> {
            return curVal+nextvalue; //overwrite next with this
        });
        System.out.println(Arrays.toString(nums));//[0, 1, 3, 6, 10]
    }
}
