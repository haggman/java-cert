package com.roitraining.cert.annotations_generics_collections_lambdas;

import com.roitraining.cert.shared.Dog;
import com.roitraining.cert.shared.Pet;
//extends for a parent, super for a base
public class VetClientPet<P extends Pet> { //notice how types are now all Pet
    private Pet animal; //Notice how the A then appears where a type is needed
    public void checkInAnimal(Pet animal){
        this.animal = animal;
        System.out.println(animal.getName() + " checked in and waiting.");
    }
    public Pet seeAnimal(){
        System.out.printf("You're next %s!%n", animal.getName());
        return animal;
    }
}
class VetClientPetRunner {
    public static void main(String[] args) {
        //This is now a compile error:
        //VetClientPet<String> notAPet = new VetClientPet<String>();
        Dog rex = new Dog("Rex");
        VetClientPet<Dog> vca = new VetClientPet<>();
        vca.checkInAnimal(rex); //Rex checked in and waiting.
        vca.seeAnimal(); //You're next Rex!
    }
}
