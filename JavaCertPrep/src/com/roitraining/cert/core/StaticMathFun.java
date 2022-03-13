package com.roitraining.cert.core;
public class StaticMathFun {
    public static void main(String[] args) {
        double side1 = 3;
        double side2 = 4;
        double side3;
        side3 = java.lang.Math.pow(side1, 2) + java.lang.Math.pow(side2, 2);
        side3 = java.lang.Math.sqrt(side3);
        System.out.println(side3);
        System.out.println("And just for fun, PI="+java.lang.Math.PI);
    }
}
