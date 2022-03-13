package com.roitraining.cert.core;

public class PreAndPostFixAdd {
    public static void main(String[] args) {
        int i = 13;
        System.out.println(i++);    //13
        System.out.println(i);      //14
        System.out.println(++i);    //15
        System.out.println(i);      //15
        if(i++==15) //Don't evaluate until after increment
            System.out.println("I print 16: " + i);
        if(++i==16) //Trying to slip one by you
            System.out.println("I never print");
        double l = 1;
        System.out.println(++l); //2.0
    }
}
