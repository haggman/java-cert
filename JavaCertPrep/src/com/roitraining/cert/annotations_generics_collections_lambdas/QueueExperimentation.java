package com.roitraining.cert.annotations_generics_collections_lambdas;

import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExperimentation {
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        Queue<Pet> petQueue = new LinkedList<>(owner.getPetList());
        petQueue.forEach(System.out::println);
        System.out.println(petQueue.size());//5
        Pet firstInLine = petQueue.poll();

        System.out.println("First: " + firstInLine);//Mr. Fox
        System.out.println("Second: " + petQueue.poll());//Heaven
        System.out.println(petQueue.size());//3
    }
}
