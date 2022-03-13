package com.roitraining.cert.classes_and_objects;

import com.roitraining.cert.shared.Owner;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.time.LocalTime;

public class LocalCrazy {
    private String carType = "Ford";
    private Owner owner;
    public static void main(String[] args) {
        LocalCrazy lc = new LocalCrazy();
    }
    public LocalCrazy(){
        owner = OwnerBuilder.buildOwner();
        timeToGoToTheVet();
    }
    private void timeToGoToTheVet(){
        final LocalTime timeToGo = LocalTime.now().plusHours(1);
        //If local data isn't final, it might get updated outside the knowledge
        //of the inner class. Best practice, make it final.
        class CarLoader{ // no access modifier, and can't be static
            public void load(Pet p){
                System.out.printf("Get in the %s %s, we leave at %s%n",
                        carType,p.getName(), timeToGo);
            }
        }
        CarLoader loader = new CarLoader(); //notice no need for outer.inner stuff
        for (Pet pet : owner.getPets()) {
            loader.load(pet);
        }
    }
}
