package com.roitraining.cert.classes_and_objects;

public class StringCharSequence {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.charAt(3));//l
        System.out.println(s.length());//11
        CharSequence subSequence = s.subSequence(0,5);
        System.out.println(subSequence); //Hello
    }
}
