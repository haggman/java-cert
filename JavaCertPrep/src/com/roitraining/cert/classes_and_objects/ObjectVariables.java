package com.roitraining.cert.classes_and_objects;

import com.roitraining.cert.shared.Owner;

public class ObjectVariables {
    public static void main(String[] args) {
        Owner o = new Owner("Anupe");
        Owner o2 = new Owner("Bob"), o3 = new Owner("Lee");
        Object o4 = "What?", o5=new Owner("Odd"); //Owner is type Object
        Owner o6, o7 = o6 = new Owner("Also Odd");//o6 created before used
//        Owner o8 = o9 = new Owner("Compile error");//o9 never created
//        Object o10 = "What?", Owner o11=new Owner("Compile error"); //Can't do 2 types in same dec
        var o12 = new Owner("Donna"); //Good
//        var o13 = new Owner("Sarah"), o14=new Owner("Charles"); //no, not with var
    }
}
