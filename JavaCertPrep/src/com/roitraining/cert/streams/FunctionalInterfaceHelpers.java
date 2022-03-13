package com.roitraining.cert.streams;

import com.roitraining.cert.shared.Dog;

import java.util.function.Predicate;

public class FunctionalInterfaceHelpers {
    public static void main(String[] args) {
        String month ="March";
        Predicate<String> oysterTest = o -> o.contains("r");
        Predicate<String> isMarch = o -> o.equalsIgnoreCase(month);
        System.out.println(oysterTest.test(month));//true
        System.out.println(isMarch.test(month));//true
        Predicate<String> isMarchAndOyster = oysterTest.and(isMarch);
        System.out.println(isMarchAndOyster.test(month));//true
        //month = "April";;//bad, shouldn't change variables used by lambdas
        //make them final is the best practive
        System.out.println(isMarchAndOyster.test("April"));//false
        Predicate<String> marchOrOyster = isMarch.or(oysterTest);
        System.out.println(marchOrOyster.test("April"));//true
    }
}
