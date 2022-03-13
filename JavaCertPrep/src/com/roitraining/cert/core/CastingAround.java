package com.roitraining.cert.core;

public class CastingAround {
    public static void main(String args[]){
        //Which is legal, and which isn't:
        double d = 3.14;
        double d2 = d = 555;
        float f2 = (float)3.14;
        float f3 = 3.13F;
        float f4 = 3.14f;
        int i = 3;
        float fi = 3;
        byte b = 3;
        int ci = (int)'a';
        char c = 34; //char is an unsigned sort
//        int unLucky = (int) "13"; //Compile error, why?
//        float f = 3.14; //Compile error, why?
//        short s = 300000; //Compile error, why?
//        long bi = 12345678901230;//Compile error, why?
//        int il = 3L; //Compile error, why?
    }
}
