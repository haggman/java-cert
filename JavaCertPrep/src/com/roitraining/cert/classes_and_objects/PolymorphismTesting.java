package com.roitraining.cert.classes_and_objects;

import com.roitraining.cert.shared.Cat;
import com.roitraining.cert.shared.Dog;
import com.roitraining.cert.shared.Owner;
import com.roitraining.cert.shared.Pet;

public class PolymorphismTesting {
    public static void main(String[] args) {
        Owner o = new Owner("Francis");
        Pet[] pets = new Pet[2]; //can hold any type of pet
        pets[0] = new Dog("Heaven"); //upcast, automatic
        pets[1] = new Cat("Esme");   //sometimes called widening
        o.setPets(pets); //to support ArrayList
        for (Pet pet : pets) { //This is why polymorphism is great
            pet.eat();  //Calls the appropriate version
        }
        //pets[1].fetch();//compile error, fetch not defined for ref type (Pet)
        //Though pet[1] is a "Pet," Java never forgets the real type
        //Dog d = (Dog)pets[1];//compiles, but ClassCastException, can't make a Cat a Dog
        for (Pet pet : pets) { //Probably a poor design, but works
            if(pet instanceof Dog) //notice instanceof operator
                ((Dog) pet).fetch(); //downcast, not automatic because of above, not always legal
        }
    }
}
