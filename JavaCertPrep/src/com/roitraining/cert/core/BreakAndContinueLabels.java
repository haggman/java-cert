package com.roitraining.cert.core;

public class BreakAndContinueLabels {
    public static void main(String[] args) {
        //Loop till 3 then "break" out
        OUTER:
        for(int i = 1; i<=10; i++){
            System.out.println("Pre-test " + i);
            //Stop the loop at the first
            if(i%3==0) break OUTER;
            System.out.println("Post-test " + i);
        } //OUTER "breaks" here
        //Loop until 3, don't print post,
        //then jump up to test and keep looping
        //So, same as a continue with no label
        OUTER2: //continue "continues" in i<=10 test
        for(int i = 1; i<=10; i++){
            System.out.println("2Pre-test " + i);
            if(i==3) continue OUTER2;
            System.out.println("2Post-test " + i);
        }}}
