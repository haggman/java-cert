package com.roitraining.cert.annotations_generics_collections_lambdas;

import com.roitraining.cert.shared.Owner;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

public class CommonLambdas {
    public static void main(String[] args) {
        Owner owner = OwnerBuilder.buildOwner();
        Pet[] pets = owner.getPets();

    }
}
