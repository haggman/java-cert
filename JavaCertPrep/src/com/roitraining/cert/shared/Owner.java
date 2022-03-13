package com.roitraining.cert.shared;

import java.util.UUID;

public class Owner {
    private UUID ownerId;
    private String name;
    private Pet[] pets;

    public Owner(String name, Pet[] pets) {
        this(name);
        this.pets = pets;
    }

    public Owner(String name) {
        this.ownerId = UUID.randomUUID();
        this.name = name;
    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
        for (Pet pet : pets) {
            pet.setOwner(this);
        }
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }
}
