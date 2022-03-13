package com.roitraining.cert.core;

public class VariableMess {
    public static void main(String[] args) {
        int w, x; //two ints
//        int y, float z; //compile error, multiple types
        int a, b[], c; //only b is an array, 1d
        int[] d, e, f; // all three arrays
        int[] h, i, j[]; // h & i 1d, j is 2d
//        int[2] k; //compile error
        b = new int[3]; //good, now we have an array of 0s
        args = new String[3]; //this is array of refs
//        d = new int(); //compile error, must use []
//        e = {1, 2, 3}; //compile error, e isn't array ref
        int l[] = {1,2,3}; //works fine
        int l2[] = new int[]{1,2,3};//also legal
//        int l3[] = int[]{1,2,3};//compile error, see above
        int[] m, n = new int[3]; //m is array ref, but n has its array
        int[] p, o = p = new int[3]; //o and p are same array
        int[]p2, o2 = p2 = new int[]{1, 2, 3}; //works fine
//        int[]p3, o3 = p3 = {1, 2, 3}; //compile error, see above
    }
}
