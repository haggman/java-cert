package com.roitraining.cert.classes_and_objects;

public class StaticVariables {
    static String sharedData;

    public static void main(String[] args) {
        StaticVariables s1 = new StaticVariables();
        StaticVariables s2 = new StaticVariables();
        s1.sharedData = "Test";
        System.out.println(s2.sharedData); //Test
    }
}
