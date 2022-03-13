package com.roitraining.cert.core;

public class WhatTheIf {
    public static void main(String[] args) {
        int i = 1;
        boolean test = false;
        if(i!=1)
            if(i<10) System.out.println("i<10");
        else System.out.println("i==1");
        else System.out.println("What's this?");

        if(test=i==0)
            System.out.println("Watch the = vs ==");

        //i==0?System.out.println("Watch the = vs =="):"";
        var result = i==0?"i==o":"i!=0";
        //i==0?"i==o":"i!=0";//compile error
        System.out.println(result); //i!=0
        i=0;
        //Hideous nested ternary operator:
        var result2 = i==0?test?"i0, test true":"i0, test false":"i!=0";
        System.out.println(result2);//i0, test false
    }
}
