package com.roitraining.cert.classes_and_objects;

import java.util.Random;
//TrickyInterfaces.java
interface ADifferentTransportable{
    int earthRadius = 6371; //Any data, always public static final
    //default only allowed in interfaces
    default void moveTo(double lat, double lon) { //always public, error to add anything else
        ADifferentTransportable.prt("Start walking!");
    }
    private static void prt(Object o){ //only callable by defaults and other privates
        System.out.println(o);         //may be static or non-static
    }
    static double getDistance(double sLat, double sLon, double eLat, double eLon){
        ADifferentTransportable.prt("Fun math happens here");
        return new Random().nextDouble();
    }
}
interface TransportByAir extends ADifferentTransportable{
    void setAirplaneId(String tailNum);
    String getAirplaneId();
    default void moveTo(double lat, double lon) { //always public, error to add anything else
        System.out.println("Start flying!");      //overriding inherited default
    }
}
public class TrickyInterfaces implements TransportByAir { //default method overridable
    //if a class ever implements 2 interfaces, both with same method default method name
    //then the class would have (no longer an option) to override it
   private String tailNum;
    @Override
    public void setAirplaneId(String tailNum) {
        this.tailNum = tailNum;
    }

    @Override
    public String getAirplaneId() {
        return tailNum;
    }

    public static void main(String[] args) {
        System.out.println(ADifferentTransportable.earthRadius);//Prints: 6371
        //ADifferentTransportable.earthRadius = 10_000; //compile error, public static final
        TrickyInterfaces ti = new TrickyInterfaces();
        ti.moveTo(0,0); //Time to visit Null Island
        //Prints default: Start flying!
    }
}
