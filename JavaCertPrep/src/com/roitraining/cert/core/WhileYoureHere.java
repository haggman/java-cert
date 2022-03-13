package com.roitraining.cert.core;

public class WhileYoureHere {
    public static void main(String[] args) {
        boolean test = true;
        while (test){
            System.out.println("I want to loop!");
            if(Math.random()<.5) test = !test;
        }
        do{
            System.out.println("Leave me alone");
        }while (test);
    }
}
