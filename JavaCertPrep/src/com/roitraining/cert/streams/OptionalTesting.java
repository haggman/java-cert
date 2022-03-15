package com.roitraining.cert.streams;

import com.roitraining.cert.shared.Dog;
import com.roitraining.cert.shared.Pet;

import java.util.Optional;
import java.util.Random;

public class OptionalTesting {
    Random rand = new Random();
    public static void main(String[] args) {
        OptionalTesting ot = new OptionalTesting();
        //someone hands me something that's optional
        //
        Optional<Pet> possiblePet = ot.getPet(); //return Optional wrapping pet
        if(possiblePet.isPresent()) //Safe check to see if there's a pet and if so:
            System.out.println("A pet! " + possiblePet.get());//get it, throws exception if nothing there
        //there are also several other methods including ifPresent(Consumer c)
        // orElse (T other), orElseGet(Supplier s), orElseThrow(), orElseThrow(Supplier s)
    }
    public Optional<Pet> getPet(){
        int test = rand.nextInt(10);
        Dog d = new Dog("Spot");
        Optional<Pet> maybePet;
        if(test <5)
            maybePet = Optional.of(d); //Wrap the pet
        else
            maybePet = Optional.empty();//Empty optional
        return maybePet;
    }
}
