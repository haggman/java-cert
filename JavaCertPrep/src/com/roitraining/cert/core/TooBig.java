package com.roitraining.cert.core;

public class TooBig {
    public static void main(String args[]){
        long l = Integer.MAX_VALUE; //2147483647
        int bigI = (int)l;
        System.out.println(bigI); //2147483647
        bigI++;
        System.out.println(bigI); //-2147483648 (same as MIN_VALUE)
        l = l*5;
        System.out.println(l);  //10737418235
         bigI = (int)l;
        System.out.println(bigI);//2147483643
        double d = Double.MAX_VALUE;
        System.out.println(d); //1.7976931348623157E308
        System.out.println(d*2);//Infinity
    }
}
