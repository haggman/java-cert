package com.roitraining.cert.shared;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class OwnerArrayList extends Owner {
    List<Pet> petArrayList; //lots of methods easier for List over ArrayList

    @Override
    public Pet[] getPets() { //argument used for typing
        return petArrayList.toArray(new Pet[0]); //toArray() returns Object[]
    }

    @Override
    public void setPets(Pet[] pets) {
        petArrayList = new ArrayList<>(Arrays.asList(pets));
    }

    public List<Pet> getPetList() {
        return petArrayList;
    }

    public void setPetArrayList(List<Pet> petArrayList) {
        this.petArrayList = petArrayList;
    }

    public void addPet(Pet pet){
        petArrayList.add(pet);
    }

    public OwnerArrayList(String name, Pet[] pets) {
        super(name, pets);
        petArrayList= new ArrayList<>();
        setPets(pets);
    }

    public OwnerArrayList(String name) {
        this(name, (Pet[])null);
    }

    public OwnerArrayList(Owner owner) {
        this(owner.getName(), owner.getPets());
    }

    public OwnerArrayList(String name, List<Pet> pets){
        this(name);

    }

    @Override
    public String toString() {
        StringBuilder petsStr = new StringBuilder();
        for(Pet pet : petArrayList){
            petsStr.append("{petName="+pet.getName()+"},");
        }
        petsStr.deleteCharAt(petsStr.length()-1); //drop end ,
        return "Owner{" +
                "name='" + getName() + '\'' +
                ", pets=["+ petsStr + "]}";
    }
}
