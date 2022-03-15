package com.roitraining.cert.streams;

import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerBiExperiment {
    public static void main(String[] args) {
        //Consumer and BiConsumer does something with 1 or 2 args
        //but doesn't return anything
        //void accept(T t);
        //void accept(T t, U u);
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        List<Pet> pets = owner.getPetList();
        Consumer<Pet> prinPet = System.out::println;//the function that "Consumes" pets
        pets.forEach(prinPet); //The internal forEach then just calls it once per element
    }
}
