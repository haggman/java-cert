package com.roitraining.cert.shared; //Optional, must be first if used
import java.util.UUID;//between package and class declaration
public class Dog extends Pet { //Only one public class per file
    //Constructors, same name, no return type (not even void)
    public Dog(String name, Owner owner, UUID id) {
        super(name, owner, id); //call to parent constructor with this sig
    }                           //make sure sig matches!
    public Dog(String name, Owner owner) {
        super(name, owner);
    }
    public Dog(String name) {
        super(name);
    }
    //Note, child class may not see private data or methods in parent, thus getName()
    public void fetch(){ //functionality
        System.out.printf("Get the ball %s!%n", getName());
    }
    @Override
    public void eat() {
        System.out.println("FOOOD! I'm so happy! Food, food, food!");
    }
}
