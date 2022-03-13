package com.roitraining.cert.core;

public class MultiDimArrays {
    public static void main(String[] args) {
        int numbers[][] = new int[2][3];//regular array
        int numbers2[][] = new int[2][];//ragged edge array
        numbers2[0] = new int[1];//notice each row is
        numbers2[1] = new int[2];//an array of its own
        int numbers3[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < numbers3.length; i++) {
            for (int j = 0; j < numbers3[i].length; j++) {
                System.out.printf("(%s,%s):%s\n", i, j, numbers3[i][j]);
            }

        }
    }
}
