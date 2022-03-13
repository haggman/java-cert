package com.roitraining.cert.shared;

import java.io.Serializable;
import java.util.UUID;

public abstract class Pet  implements Comparable<Pet>, Transportable { //not directly instantiatable
    private UUID pedId;
    private String name;
    private Owner owner;

    public Pet(String name, Owner owner, UUID petId) {
        this.name = name; //this.object Instance Variable
        this.owner = owner;//only required here to differentiate variables
        this.pedId = petId;
    }

    public Pet(String name, Owner owner) {
        this(name, owner, UUID.randomUUID());
    }
    public Pet(String name){
        this(name, null); //this() one constructor calling another
    }

    public UUID getPedId() {
        return pedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override //Compiler, please make sure I'm overriding something
    public String toString() {
        return "Pet{" +
                "name='" + this.name + '\'' + //this. implicit inside class
                ", owner=" + owner +
                '}';
    }
    public abstract void eat();

    @Override
    public int compareTo(Pet p) {
        return name.compareTo(p.getName());
    }

    @Override
    public void moveTo(double lat, double lon) {
        System.out.printf("Ok %, get in the car. %n", name);
    }
}
