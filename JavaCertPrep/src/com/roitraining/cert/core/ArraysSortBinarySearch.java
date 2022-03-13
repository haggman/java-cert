package com.roitraining.cert.core;
import java.util.Arrays;
public class ArraysSortBinarySearch {
    public static void main(String[] args) {
        int nums[] = {5, 7, 2, 4, 1, 6, 6};
        //!!!! binarySearch won't reliably work correctly on unsorted data
        System.out.println(Arrays.binarySearch(nums, 4));
        Arrays.sort(nums); //Array elements must be "Comparable" (have natural order)
        System.out.println(Arrays.toString(nums)); //[1, 2, 4, 5, 6, 6, 7]
        System.out.println(Arrays.binarySearch(nums, 4));//2
        //If an element is missing, the result will be -
        //and the number will be where it would be inserted
        System.out.println(Arrays.binarySearch(nums, 3));//-3
        //No guarantee which one will match if duplicates
        System.out.println(Arrays.binarySearch(nums, 6));//5
    }
}
