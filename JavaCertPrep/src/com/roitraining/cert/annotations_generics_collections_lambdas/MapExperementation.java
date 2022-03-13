package com.roitraining.cert.annotations_generics_collections_lambdas;

import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class MapExperementation {
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        List<Pet> petList = owner.getPetList();
        UUID firstPetId = petList.get(0).getPedId();
        HashMap<UUID, Pet> petMap = new HashMap<>(); //note the type for key and value
        petList.forEach(pet -> petMap.put(pet.getPedId(),pet));
        petMap.forEach((id, pet)-> System.out.printf("[%s,%s]%n", id, pet.getName()));
        for (UUID uuid : petMap.keySet()) { //same as above, the classic approach
            System.out.printf("[%s,%s]%n", uuid, petMap.get(uuid)); //have the key and value
        }
        petMap.values().forEach(System.out::println); //nice way to print just values
        //petMap.contains(firstPetId);//compile error! Don't fall for that
        System.out.println("First still there? " + petMap.containsKey(firstPetId)); //true
    }
}
