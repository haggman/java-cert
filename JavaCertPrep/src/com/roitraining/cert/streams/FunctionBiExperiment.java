package com.roitraining.cert.streams;

import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.List;
import java.util.function.Function;

public class FunctionBiExperiment {
    public static void main(String[] args) {
        //Function and BiFunction take one or two arguments
        //apply a function, and return a new type
        //R apply(T t);
        //R apply(T t, U u);
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        List<Pet> pets = owner.getPetList();
        Function<Pet, Integer> nameLength = (pet) -> pet.getName().length();
        for (Pet pet : pets) {
            System.out.println(nameLength.apply(pet));
        }

    }

}
