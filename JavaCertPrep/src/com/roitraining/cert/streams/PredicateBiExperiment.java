package com.roitraining.cert.streams;

import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateBiExperiment {
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        Pet[] pets = owner.getPets();
        //Predicate and Bi(2) Predicate are usually used for testing, filtering, comparing, etc
        //Remember the return, boolean not int
        //boolean test(T t);
        //boolean test(T t, U u);
        BiPredicate<Pet, Pet> compare = (p1, p2) -> p1.getName()==p2.getName();
        System.out.println("p1 and p4 have same name? " + compare.test(pets[1], pets[4]));//true
    }
}
