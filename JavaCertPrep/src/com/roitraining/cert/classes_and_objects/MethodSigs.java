package com.roitraining.cert.classes_and_objects;

public class MethodSigs {
    public static void main(String[] args) {
        new MethodSigs();
    }
    //return must be next to method name, others in any order
    static public void sFun(){System.out.println("Not a problem");}
//    static void public sNoFun(){} //compile error, type not next to name

    public MethodSigs(){//Constructor, pick the visibility, no return type, can't be static
//        doSomething();
        doSomething2();
    }
    //    private doSomething() {}//compile error, return type required (except constructors)
    void doSomething2() {} //legal, but not typical, package-private
    public void dontTouch(final int specialNumber){}//legal, method just can't change the value
    //Remember, varargs always last! Creates an array with 0..* elements
    public void variableArgs(int required, String required2, int... numbers){}}
