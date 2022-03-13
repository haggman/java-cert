package com.roitraining.cert.shared;

import java.util.ArrayList;
import java.util.List;

public class OwnerBuilder {
    private OwnerBuilder(){}
    public static Owner buildOwner(){
        Owner owner = new Owner("Patrick");
        Pet pets[] = {
                new Dog("Mr. Fox"),
                new Dog("Heaven"),
                new Cat("Esme"),
                new Cat("Ariel"),
                new Dog("Heaven")//name dupe
        };
        owner.setPets(pets); //support for ArrayList
        return owner;
    }

    public static OwnerArrayList buildOwnerArrayList(){
        return new OwnerArrayList(buildOwner());
    }

}
