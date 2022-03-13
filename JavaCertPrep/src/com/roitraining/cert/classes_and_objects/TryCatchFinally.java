package com.roitraining.cert.classes_and_objects;

import com.roitraining.cert.shared.Owner;
import com.roitraining.cert.shared.OwnerBuilder;
import com.roitraining.cert.shared.Pet;

import java.util.ArrayList;

public class TryCatchFinally {
    public static void main(String[] args) {
        Owner owner = OwnerBuilder.buildOwner();
         try{
             int lengthGuess = Integer.parseInt(args[0]);
             Pet[] pets = owner.getPets();
             for (int i = 0; i < lengthGuess; i++) {
                System.out.printf("%s's pet #%s: %s%n",
                owner.getName(),i,pets[i]);
            }
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {//unchecked exceptions
             System.err.println("Problem with argument: " + e.getMessage());
             return;
         } catch (Exception e){//Parent of the other exceptions, so catch last
             System.err.println("Any other error goes here:" + e.getMessage());
            //Prints: Blew up processing pets: Index 4 out of bounds for length 4
            //just after the finally message:
        } finally { //finally, if used, must come after catch blocks, though legal with no catches
             System.out.println("Last words here!");
        }
    }
}
