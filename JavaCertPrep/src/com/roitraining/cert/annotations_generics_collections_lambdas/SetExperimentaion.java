package com.roitraining.cert.annotations_generics_collections_lambdas;

import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExperimentaion {
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        List<Pet> pets = owner.getPetList();
        Set<String> nameSet = new HashSet<>(); //hashtable like structure
        pets.forEach(pet -> System.out.println(pet.getName()));//2 Heavens in data
        pets.forEach(pet -> nameSet.add(pet.getName()));//load names
        System.out.println(nameSet);//Only one in the set, no order preserved
        Set<String> nameTree = new TreeSet<>(); //same with a tree, sorts as you add
        pets.forEach(pet -> nameTree.add(pet.getName()));
        System.out.println(nameTree);//Only one, and alphabetized (natural order)
    }
}
