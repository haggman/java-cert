package com.roitraining.cert.classes_and_objects;

public final class ThatsFinal { //class may not be overridden
    private final String name; //malleable until the end of construction
    //below is the closest thing Java has to a true constant
    public final static String SLOGAN = "Write once, run anywhere";

    public ThatsFinal(String name){
        this.name = name;
    }
    public final void doSomething(){} //method may not be overridden by child (redundant in this example)

    public static void main(String[] args) {
        ThatsFinal tf = new ThatsFinal("Mr. Fox");
//        tf.name = "I change my mind!"; //too late, value already fixed, compile error
    }
}
