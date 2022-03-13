package com.roitraining.cert.core;

public class BreakAndContinue {
    public static void main(String[] args) {
        int nums[]={0,1,2,3,4,5,6,7,8,9};
        int testVal = (int)(Math.random()*10);
        System.out.println("testVal="+testVal);
        for(var num : nums){
            if(num == testVal)
                break;
            else if(num%2==0)
                continue;
            else
                System.out.println("Odd!");
        }
    }
}
