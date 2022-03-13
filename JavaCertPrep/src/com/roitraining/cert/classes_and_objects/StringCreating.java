package com.roitraining.cert.classes_and_objects;

public class StringCreating {
    public static void main(String[] args) {
        String h1 = "Hello", h2 = "Hello";
        String h3 = new String("Hello");
        //constructors including: char[], byte[], int[], StringBuffer
        String h4 = new String(new char[] {'H','e','l','l','o'});
        System.out.println("h1, h2 same String? " + (h1==h2));//true
        System.out.println("h1, h3 same String? " + (h1==h3));//false
        System.out.println("h1.equals(h3)?" + h1.equals(h3));//true
        h3 = h3.intern(); //Move to the String Pool, new reference
        h4 = h4.intern();
        System.out.println("h1, h3 same String? " + (h1==h3));//true
        System.out.println("h3, h4 same String? " + (h3==h4));//true
    }
}
