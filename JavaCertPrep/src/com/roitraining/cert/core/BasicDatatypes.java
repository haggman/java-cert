package com.roitraining.cert.core;

import java.lang.Math;

public class BasicDatatypes {
    private int num;
    private double dNum, dNum2;
    private static double sdNum;

    public static void main(String[] args){
//        private float fl = 3;    //Compile error, why?
        long l;
        int num = 5;
        int numB = 0b00000000_00001101;
        System.out.println(num); //Legal? If so, what's it print?
        System.out.println(numB); //Legal? If so, what's it print?
//        System.out.println(dNum);//Legal? If so, what's it print?
        System.out.println(sdNum);//Legal? If so, what's it print?
//        System.out.println(l);   //Legal? If so, what's it print?
        BasicDatatypes bd = new BasicDatatypes();
        bd.printSomeStuff();
//        System.out.println(bd.getValue(Math.random()));
    }
    public void printSomeStuff(){
        long l;
        System.out.println(num); //Legal? If so, what's it print?
//        System.out.println(l);   //Legal? If so, what's it print?
    }

//    public int getValue(double d){
//        double answer;
//        if(d < .5)
//            answer = 13;
//        return answer;  //Why is the compiler upset here?
//    }
}
