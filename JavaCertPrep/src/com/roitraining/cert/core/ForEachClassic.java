package com.roitraining.cert.core;

import java.util.ArrayList;
import java.util.List;

public class ForEachClassic{
    public static void main(String[] args) {
        ArrayList<String> names =
                new ArrayList<>(List.of("Dave", "Lee", "Astha"));
        //Make sure the temp variable (name) can hold
        //instances from the collection.
        //Make sure second part is actually collection or array
        for (String name : names) {
            System.out.println(name);
        }
    }
}
