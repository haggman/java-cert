package com.roitraining.cert.core;

import java.util.ArrayList;
import java.util.List;

public class ForEachGotcha {
    public static void main(String[] args) {
        String moreNames = "Jeff";
        int[] numbers = {1,2,3};
        ArrayList<String> names =
                new ArrayList<>(List.of("Dave", "Lee", "Astha"));
//        for(String name:name){} //Compile error
//        for(String name:moreNames){} //Compile error
//        for(String aNumber:numbers){} //Compile error
    }
}
