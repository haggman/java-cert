package com.roitraining.cert.shared;

import java.io.Serializable;
import java.util.UUID;

public class Cat extends Pet {
    public Cat(String name, Owner owner, UUID petId) {
        super(name, owner, petId);
    }
    public Cat(String name, Owner owner) {super(name, owner);}
    public Cat(String name) {super(name);} //call constructor in parent with this sig.

    public void doNothing(){ }
    public void scarePuppy(){System.out.println("Hisssssss");}

    @Override //override parent method, but use parent version in this override
    public String toString() {
        return "Rulers of the world! " + super.toString();
    }
    @Override
    public void eat() {
        System.out.println("Cat food, again, and I see it's late as usual!");
    }
}
