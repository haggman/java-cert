package com.roitraining.cert.core;

public class TypePromotion {
    public static void main(String[] args) {
        Object testObj;
        byte b = 1;
        short s = 2;
        var iS = +s; //s byte, + opp makes it now an int!
        testObj = iS;
        System.out.println("iS is an int " + (testObj instanceof Integer));
//        s = s + b; //compile error
        var i = s + b; //compiles, but type of i int
        testObj = i;
        System.out.println("i is an int " + (testObj instanceof Integer));
        var div = b/2;
        System.out.println("b/2=" + div); //0! remember, integers
        var div2 = b/2.;
        System.out.println("b/2.="+ div2); //.5, now type double
        System.out.println(b/2/4.); //0.0, type promotion goes with operation order
    }
}
