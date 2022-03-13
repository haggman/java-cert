package com.roitraining.cert.classes_and_objects;
import static com.roitraining.cert.classes_and_objects.PetSizeFancy.*;
public class EnumExperiments {
    public static void main(String[] args) {
        PetSizeBasic size = PetSizeBasic.SMALL;//clear, and concise, no static import to shorten
        PetSizeFancy fSize = MEDIUM; //note the static import
        //Remember, can use in switch statements too
        if(fSize==MEDIUM) System.out.println("Medium dog, do something...");
        System.out.println("MEDIUM same as: " + MEDIUM.getSizeRange());//call methods
        PetSizeFancy psf = PetSizeFancy.valueOf("LARGE");//must be exact match, including case
        System.out.println(psf);
    }
}
