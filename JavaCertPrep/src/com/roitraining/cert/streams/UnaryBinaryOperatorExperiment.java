package com.roitraining.cert.streams;

import com.roitraining.cert.shared.Owner;
import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorExperiment {
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        List<Pet> pets = owner.getPetList();
        //UnaryOperator and BinaryOperator are actually subtypes
        //of Function and BiFunction. In this case,
        //the data types of all the arguments has to be the same
        //T apply(T t);
        //T apply(T t, U u);
        //Compile error, types are different
        //UnaryOperator<Pet> nameCapper = pet -> pet.getName().toUpperCase();

        UnaryOperator<String> nameUpperCase = String::toUpperCase;
        pets.forEach(pet -> System.out.println(nameUpperCase.apply(pet.getName())));
    }
}
