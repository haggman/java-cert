package com.roitraining.cert.classes_and_objects;

import java.util.Locale;

public class

StringManipulation {
    public static void main(String[] args) {
        String s = "Hello ", s2 = "hello ";
        prt(s.substring(1,3));//el, always [start, end)
        prt("["+s.strip()+"]");//[Hello], prefer over trim
        prt(s.toLowerCase());//hello
        prt(s.startsWith("He"));//true
        prt(s.matches("^H.+$"));//RegEx true
        prt(s.repeat(3));//Hello  Hello  Hello
        prt(s.indexOf('l'));//2 first index
        prt(s.lastIndexOf('l'));//3
        prt(s.equals(s2));//false
        prt(s.equalsIgnoreCase(s2));//true
        prt(s.compareTo(s2));//-32
        prt('H'-'h');//-32
        prt("".isEmpty());//true, prefer isBlank()
        prt("  ".isEmpty());//false
        prt("".isBlank() && "  ".isBlank()); //true
    }
    protected static void prt(Object o){
        System.out.println(o);
    }
}
