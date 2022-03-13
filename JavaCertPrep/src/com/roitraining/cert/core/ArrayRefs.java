package com.roitraining.cert.core;

public class ArrayRefs {
    public static void main(String[] args) {
        int i[] = {1,2,3};
        int j[] = i; //two references to the same array
        System.out.printf("i[1] = %s, j[1]=%s%n", i[1], j[1]);
        //prints: i[1] = 2, j[1]=2
        i[1] = 13;
        System.out.printf("i[1] = %s, j[1]=%s%n", i[1], j[1]);
        //prints: i[1] = 13, j[1]=13
    }
}
