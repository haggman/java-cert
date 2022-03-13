package com.roitraining.cert.classes_and_objects;

public class StaticAndNon {
    private String msg; //Instance data
    //if msg was "static" this would all work fine
    public static void main(String[] args) { //static method
//        msg = "Hello World!";   //compile error
//        System.out.println(msg);//compile error
        StaticAndNon san = new StaticAndNon();
//        msg = "Hello World"; //still compile error!
        san.msg = "Hello World"; //good
        System.out.println(san.msg); //works, all in same class def.
        System.out.println(san.getMsg());// better design
    }
    public String getMsg(){//instance method
        return msg; // part of instance, so this. implicit
    }
}
