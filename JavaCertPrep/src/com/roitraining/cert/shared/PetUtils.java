package com.roitraining.cert.shared;

import java.util.List;

public class PetUtils {
    //Works for stand alone, methods, typically (but not necessarily) static
    //Notice the generic declaration to the left of the return type
    public static <T extends Pet> void washPets(List<T> petsIn){
        petsIn.forEach(p -> System.out.println("Washing " + p.getName()));
    }
}

class PetUtilsRunner{
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        PetUtils.washPets(owner.getPetList());
    }
}
