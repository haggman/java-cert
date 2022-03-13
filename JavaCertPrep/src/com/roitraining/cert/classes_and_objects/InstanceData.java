package com.roitraining.cert.classes_and_objects;

import com.roitraining.cert.shared.Dog;

public class InstanceData {
    public static void main(String[] args) {
        Dog d1, d2 = null; //Satisfies the "must be initialized before use" rule
        //System.out.println(d1.getOwner());//NullPointerException
        d1=new Dog("Rex");
        d2=new Dog("Spot");
        //Instance data belongs to the instance
        System.out.println(d1.getName());//Rex
        System.out.println(d2.getName());//Spot
    }
}
