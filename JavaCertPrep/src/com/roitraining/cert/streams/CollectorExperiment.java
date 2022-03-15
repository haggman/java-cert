package com.roitraining.cert.streams;

import com.roitraining.cert.shared.Dog;
import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorExperiment {
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        List<Pet> pets = owner.getPetList();
        List<String> petNames = //List of pet names
                pets.stream().map(Pet::getName).collect(Collectors.toList());
        //Convert pet names list into a single string
        String petNamesString = petNames.stream().collect(Collectors.joining(", "));
        //Doesn't apply the joiner to the final entry: Mr. Fox, Heaven, Esme, Ariel, Heaven
        System.out.println("petNamesString: " + petNamesString);
        Map<UUID, String> petNameMap = pets.stream().collect(Collectors.toMap(
                Pet::getPedId,Pet::getName));       //Build a map of pets <UUID, Name>
        System.out.println("petNameMap: " + petNameMap);
        Map<UUID, Pet> petMap = pets.stream().collect(Collectors.toMap(
                Pet::getPedId, Function.identity())); //Build a map of pets <UUID, Pet>
        System.out.println("petMap: "+ petMap);
        //generate two lists, one of dogs, one of cats, each stored under a map key
        Map<Boolean,List<Pet>> trueDogs = pets.stream().collect(
                Collectors.partitioningBy(s -> s instanceof Dog));
        System.out.println("Dog list: " + trueDogs.get(true)); //prints just the dogs
    }
}
