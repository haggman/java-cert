package com.roitraining.cert.streams;
import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.List;
import java.util.function.*;
public class MissUsedFunctionals {
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        Pet[] pets = owner.getPets();
        //what's wrong with the following (check the source
        //file for the answers
//        Supplier<Integer, Pet> sub = (p, i) -> pets[i]; //no arg to get
//        Predicate<Pet> bi = System.out::println;//should return a boolean
//        Function<Pet, String>func = Pet::toString; //nothing, this is fine
    }
}
