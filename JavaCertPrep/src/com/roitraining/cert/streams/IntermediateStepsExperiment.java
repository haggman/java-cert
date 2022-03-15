package com.roitraining.cert.streams;

import com.roitraining.cert.shared.*;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class IntermediateStepsExperiment {
    public static void main(String[] args) {
        Random rand = new Random();
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        //Create some streams to play with:
        List<Pet> pets = owner.getPetList();
        Stream<Pet> petStream = pets.stream(); //infinite stream of random numbers
        Stream<Integer> lotsOfNumbers = Stream.iterate(1, n->  rand.nextInt());

        //Remember, IRL, only one of these could run at a time, without recreating the stream
        lotsOfNumbers.filter(n -> n%2==0);//This does nothing, why?
        //print an infinite list of random numbers:
        lotsOfNumbers.filter(n -> n%2==0).forEach(System.out::println);
        //This might be better, how about just the first 10, sorted...
        lotsOfNumbers.limit(10).sorted().forEach(i -> System.out.print(i+" "));
        //This might be better, how about just the first 10 even, sorted...
        lotsOfNumbers.filter(n -> n%2==0).limit(10).sorted().forEach(i -> System.out.print(i+" "));
        System.out.println();
        //print all the pets with a name which starts with H
        petStream.filter(pet-> pet.getName().startsWith("H")).forEach(System.out::println);
        System.out.println("Size of the pets list? " + pets.size()); //5
        owner.addPet(new Dog("Rex"));
        owner.addPet(new Cat("Fluffy"));
        System.out.println("Size of the pets list (List)? " + pets.size());//7
        //the lazy stream knows where to find the data, so when we run it
        //that's when it does it's work
        System.out.println("Size of the pets list (Stream)? " +petStream.count());

    }
}
