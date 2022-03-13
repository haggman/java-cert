package com.roitraining.cert.classes_and_objects;

public class StringValueOf {
    public static void main(String[] args) {
        char[] helloChars = new char[] {'H','e','l','l','o'};
        String hConstruct = new String(helloChars,0,3);//Hel
        System.out.println(hConstruct);
        String hValueOf = String.valueOf(helloChars,0,3);//Hel
        System.out.println(hValueOf);
    }
}
