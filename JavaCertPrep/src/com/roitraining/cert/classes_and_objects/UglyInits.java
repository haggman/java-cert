package com.roitraining.cert.classes_and_objects;

import java.time.LocalDateTime;

public class UglyInits {
    private static LocalDateTime firstCreation;
    private static int i;
    private String msg;
    public UglyInits(){ //Default constructor, leave it out and an empty one will be provided for you
        System.out.println("In Constructor " + i++);//4, 7
        msg = "Hello World!";
    }
    public static void main(String[] args) {
        System.out.println("About to create UglyInits " + i++);//2
        UglyInits ug = new UglyInits();
        System.out.println("Just create UglyInits1 " + i++); //5
        UglyInits ug2 = new UglyInits();
        System.out.println("Just created UglyInits2 " + i++);//8
    }

    {   //rarely used initializer block (I could set msg here)
        System.out.println("In initializer block " + i++);//3, 6
    }

    static { //sometimes used static initializer, executes when something touches the class
        firstCreation = LocalDateTime.now();
        i = 1;
        System.out.println("In Static Initializer " + i++); //1
    }
    //private static int i;//Compile errors, static inits can only see variables above them
}
