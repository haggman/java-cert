package com.roitraining.cert.classes_and_objects;

public class StringBuilderManipulation {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello").append("!");//Hello!
        builder.insert(5," World");//offset "Hello World!"
        System.out.println(builder);
        builder.replace(5,12, "!");//again [start, end)
        System.out.println(builder);//Hello!
        builder.reverse();
        System.out.println(builder);//!olleH
    }
}
