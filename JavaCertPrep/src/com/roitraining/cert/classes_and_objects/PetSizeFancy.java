package com.roitraining.cert.classes_and_objects;

public enum PetSizeFancy {
    SMALL("0-1 stone"), MEDIUM("1-2 stone"),
    LARGE("2-5 stone"), XLARGE("5-* stone"); //don't forget ;
    private final String sizeRange;

    PetSizeFancy(String sizeRange) {
        this.sizeRange = sizeRange;
    }

    public String getSizeRange(){
        return sizeRange;
    }
}
