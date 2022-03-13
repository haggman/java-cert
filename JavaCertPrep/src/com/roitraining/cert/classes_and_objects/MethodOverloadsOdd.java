package com.roitraining.cert.classes_and_objects;

public class MethodOverloadsOdd {
    public void doSomething(){System.out.println("void doSomething()");}
    //public int doSomething(){} //compile error, can't only override by return
    public int doSomething(int i){return 13;}
    //Ok to vary visibility, but might be a poor design
    protected void doSomething(double d){System.out.println("void doSomething()");}
    private void doSomething(Integer i){System.out.println("void doSomething()");}
}
