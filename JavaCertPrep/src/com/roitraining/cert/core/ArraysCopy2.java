package com.roitraining.cert.core;

import com.roitraining.cert.shared.Dog;
import com.roitraining.cert.shared.Owner;

import java.util.Arrays;

public class ArraysCopy2 {
    public static void main(String[] args) {
        Owner boss = new Owner("Lee");
        Dog rex = new Dog("Rex", boss), spot = new Dog("Spot", boss);
        Dog[] dogs = {rex, spot};
        Dog[] dogsC1, dogsC2, dogsC3, dogsC4;
        dogsC1 = new Dog[dogs.length];
        System.out.println(Arrays.toString(dogs)); //All the below copies toString the same:
        //[Dog{name='Rex', owner=Owner{name='Lee'}}, Dog{name='Spot', owner=Owner{name='Lee'}}]
        System.arraycopy(dogs,0,dogsC1,0,dogs.length); //The classic
        dogsC2 = Arrays.copyOf(dogs, dogs.length);
        dogsC3 = Arrays.copyOfRange(dogs, 0,dogs.length+1);//fill extra with null
        dogsC4 = dogs.clone(); //From the Object class
        System.out.println(Arrays.toString(dogsC4)); //they would all toString the same:
        //[Dog{name='Rex', owner=Owner{name='Lee'}}, Dog{name='Spot', owner=Owner{name='Lee'}}]
        //Same results below for all copies
        System.out.println("Same array? " + (dogs == dogsC1)); //false
        System.out.println("Same Dogs? " + (dogs[0] == dogsC1[0]));//true
        System.out.println("Same Owner object? " + (dogs[0].getOwner() == dogsC1[0].getOwner()));//true
    }
}
