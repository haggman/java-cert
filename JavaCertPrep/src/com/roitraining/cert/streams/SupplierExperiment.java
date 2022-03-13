package com.roitraining.cert.streams;

import com.roitraining.cert.shared.OwnerArrayList;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.Iterator;
import java.util.List;
import java.util.function.*;

public class SupplierExperiment<T> {
    public static void main(String[] args) {
        OwnerArrayList owner = OwnerBuilder.buildOwnerArrayList();
        List<Pet> pets = owner.getPetList();
        //Supplier used to generate a value with no input
        //T get();
        Iterator<Pet> iP = pets.listIterator();
        Supplier<Pet> petGetter = iP::next;
        System.out.println(petGetter.get());
        //Pet{name='Mr. Fox', owner=Owner{name='Patrick'}}
        System.out.println(petGetter.get());
        //Pet{name='Heaven', owner=Owner{name='Patrick'}}
        System.out.println(petGetter.get());
        //Rulers of the world! Pet{name='Esme', owner=Owner{name='Patrick'}}
    }
}
