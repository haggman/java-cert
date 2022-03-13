package com.roitraining.cert.core;

public class OddMinusMinus {
    public static void main(String[] args) {
        int i = 13, j=i--, k=--i, l;
        System.out.printf("i=%s, j=%s, k=%s\n", i, j, k);//i=11, j=13, k=11
        j = i-- + 11; //i=11 going in
        System.out.printf("i-- + 11= %s, i is now %s\n", j, i); //j=22,i=10
        k = i-- + i; //i=10, but i on both sides of + so becomes: 10+9
        System.out.printf("i-- + i= %s, i is now %s\n", k, i); //k=19,i=9
        l = i-- + --i; //i was 9 going in
        //9 + --(8) = 9 + 7 = 16
        System.out.printf("i-- + 5= %s, i is now %s\n", l, i); //l=16,i=7
    }
}
