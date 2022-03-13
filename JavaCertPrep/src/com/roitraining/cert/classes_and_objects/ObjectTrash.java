package com.roitraining.cert.classes_and_objects;

import com.roitraining.cert.shared.Dog;

public class ObjectTrash {
    public static void fetch(Dog localD){//localD scope started
        String msgTemplate = "Get the ball %s!%n";
        System.out.printf(msgTemplate, localD.getName());
    } //localD now out of scope, but Rex still in memory thanks to main d
      //however, String template now in garbage
    public static void main(String[] args) {
        Dog d;//no object, just a reference, scoped to main
        d = new Dog("Rex");//Constructed and initialized
        System.out.println(d.getName());//use
        fetch(d);
//        System.out.println(localD);//Compile error, localD local to fetch
//        d = null; //reference still there, Rex now in garbage
//        System.out.println(d.getName());//Compiles, but NullPointerException
    }
}
