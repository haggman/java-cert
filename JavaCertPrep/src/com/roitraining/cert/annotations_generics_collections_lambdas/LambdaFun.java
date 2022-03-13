package com.roitraining.cert.annotations_generics_collections_lambdas;

import com.roitraining.cert.shared.Owner;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaFun {
    public static void main(String[] args) {
        Owner owner = OwnerBuilder.buildOwner();
        Pet[] pets = owner.getPets();
        System.out.println(Arrays.toString(pets)); //Mr.Fox before Heaven
        Arrays.sort(pets, (p1,p2)->p1.getName().compareTo(p2.getName()));
        System.out.println(Arrays.toString(pets)); //sorted!
        Comparator<Pet> idComp = (p1, p2)-> { //java rules all apply
            return p1.getPedId().compareTo(p2.getPedId()); //return and ;
        }; //watch this ;, easy to miss
        Arrays.sort(pets, idComp);
        System.out.println(Arrays.toString(pets)); //sorted by id
        //These all generate compile errors. See details.
        //() optional for single, and required for no and multiple parameters:
        //Arrays.sort(pets, p1,p2->p1.getName().compareTo(p2.getName()));
        //if method in {} then all normal Java rules apply: return, ;, etc.
        //Arrays.sort(pets, (p1,p2)->{p1.getName().compareTo(p2.getName())});

    }
}
