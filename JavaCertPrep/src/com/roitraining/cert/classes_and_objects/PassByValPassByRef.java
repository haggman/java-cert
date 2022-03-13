package com.roitraining.cert.classes_and_objects;

import com.roitraining.cert.shared.Dog;

public class PassByValPassByRef {
    public void changeValues(Dog d, int num){
        //d scoped to this method, stack based box containing the same reference as rex
        //which means it refers to the same Dog object (same reference value)
        //now there are two different references to the same object so...
        d.setName("New Name"); //name changes in the 1 and only actual object they both ref.
        //num scoped to this method, stack based integer box containing copy of same value as i below
        //but since it's only a copy...
        num++; //this changes num, but not the other "i" copy down in main
        System.out.printf("In change method, num=%s and Dog name:%s%n", num, d.getName());
    }

    public static void main(String[] args) {
        PassByValPassByRef pb = new PassByValPassByRef();
        int i = 13; //i scoped to main, essentially a box on the stack holding the value 13
        //rex is a reference on stack, reference to the heap and the Dog object there
        //in other languages you would say that rex holds a memory address for the object
        //in Java we say it holds a reference
        Dog rex = new Dog("Rex");
        System.out.printf("In main before change method call, i=%s and Dog name:%s%n", i, rex.getName());
        pb.changeValues(rex,i);
        System.out.printf("In main after change method call, i still = %s and Dog name:%s%n", i, rex.getName());
    }
}
