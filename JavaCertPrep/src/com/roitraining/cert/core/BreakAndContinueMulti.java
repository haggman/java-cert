package com.roitraining.cert.core;

public class BreakAndContinueMulti {
    public static void main(String[] args) {
        int testVal = 3;
        for(int i=0;i<10;i++){
            System.out.println("Outer: " + i);
            for(int j = 0;j<10;j++){
                System.out.println("Inner: " + j);
                if(j == testVal)
                    break;
            }
            if(i == testVal)
                break;
        }
    }
}
