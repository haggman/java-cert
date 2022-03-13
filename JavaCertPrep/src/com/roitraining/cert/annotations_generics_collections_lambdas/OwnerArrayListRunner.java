package com.roitraining.cert.annotations_generics_collections_lambdas;

import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.List;

public class OwnerArrayListRunner {
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        System.out.println(owner);
        List<Pet> pets = owner.getPetList();
        for (Pet pet : pets) { //the classic
            System.out.println(pet);
        }
        //forEach takes a Consumer functional interface
        pets.forEach(pet -> System.out.println(pet));//not bad
        //method references tell java to wait and use the function like the lambda, by ref
        pets.forEach(System.out::println); //method reference
    }
}
